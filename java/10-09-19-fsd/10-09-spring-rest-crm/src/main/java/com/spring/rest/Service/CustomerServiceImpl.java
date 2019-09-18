package com.spring.rest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.Customer;
import com.spring.rest.Dao.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerDAO dao;

	@Transactional
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}

	public List<Customer> getByID(int id) {
		// TODO Auto-generated method stub
		return dao.getByID(id);
	}
}
