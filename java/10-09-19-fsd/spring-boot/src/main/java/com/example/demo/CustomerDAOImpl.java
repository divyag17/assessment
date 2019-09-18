package com.example.demo;

import java.util.List;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	
	@Autowired
	EntityManager em ;
	private Session session;
	
	

@Override
public Customer createNewStudent(Customer thecustomer) {
	// TODO Auto-generated method stub
	session=em.unwrap(Session.class);
	return null;
}

@SuppressWarnings("unchecked")
@Transactional
public List<Customer> getAllCustomer() {
	// TODO Auto-generated method stub
	session=em.unwrap(Session.class);
	Query query=session.createQuery("from Customer",Customer.class);
	return query.getResultList();
}

@Override
public void createCustomer(Customer thecustomer) {
	// TODO Auto-generated method stub
	session=em.unwrap(Session.class);
	Customer c=new Customer();
	
	c.setFirstName(thecustomer.getFirstName());
	c.setLastName(thecustomer.getLastName());
	c.setEmail(thecustomer.getEmail());
	session.save(c);
}




	
}