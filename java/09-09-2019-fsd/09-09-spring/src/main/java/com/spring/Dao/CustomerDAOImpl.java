package com.spring.Dao;

import java.util.List;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.entity.Customer;
import org.hibernate.query.Query;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public CustomerDAOImpl() {
		super();
	}
	public CustomerDAOImpl(SessionFactory sessionFactory, Session session) {
		super();
		this.sessionFactory = sessionFactory;
		this.session = session;
	}
	@PostConstruct
	public void createSession()
	{
		session=sessionFactory.openSession();
	}
	public List<Customer> getCustomers() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

	

	public void createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		session.saveOrUpdate(theCustomer);
	}
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();

				Customer customer=(Customer) currentSession.get(Customer.class, id);

		session.delete(customer);
	}

}
