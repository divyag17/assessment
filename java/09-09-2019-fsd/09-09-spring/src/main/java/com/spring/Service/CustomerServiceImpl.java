package com.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.Dao.CustomerDAO;
import com.spring.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	public void createCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.createCustomer(theCustomer);
	}
	@Autowired
	private CustomerDAO customerDAO;
	
	
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}


	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(id);
	}

	
}
