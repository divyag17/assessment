package com.spring.rest.Service;

import java.util.List;

import com.spring.rest.Customer;

public interface CustomerService {
	List<Customer> getAllCustomer();

	List<Customer> getByID(int id);
}
