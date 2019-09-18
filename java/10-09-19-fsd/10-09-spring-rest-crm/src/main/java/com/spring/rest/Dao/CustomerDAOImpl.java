package com.spring.rest.Dao;

import java.util.List;

import com.spring.rest.Customer;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;

	@PostConstruct
	public void init() {
		session = sessionFactory.openSession();
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		Query query=session.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}
	@PreDestroy
	public void destroy()
	{
		session.close();
	}

	public List<Customer> getByID(int id) {
		// TODO Auto-generated method stub
		Query query=session.createQuery("from Customer where id=:customerId",Customer.class);
		query.setParameter("customerId", id);
		return query.getResultList();
		
	}
}