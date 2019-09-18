package com.spring.Service;

import java.util.List;

import com.spring.entity.Customer;

public interface CustomerService {
	public void createCustomer(Customer theCustomer);

	List<Customer> getCustomers();

	public void deleteCustomer(int id);
}
