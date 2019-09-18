package com.spring.Dao;

import java.util.List;

import com.spring.entity.Customer;

public interface CustomerDAO {
	public void createCustomer(Customer theCustomer);

	public List<Customer> getCustomers();

	public void deleteCustomer(int id);


}
