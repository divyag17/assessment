package com.example.demo;

import java.util.List;


public interface CustomerDAO {
	public Customer createNewStudent(Customer thecustomer);

	public List<Customer> getAllCustomer();

	public void createCustomer(Customer thecustomer);

}
