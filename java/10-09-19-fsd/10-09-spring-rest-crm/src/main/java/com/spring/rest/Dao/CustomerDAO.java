package com.spring.rest.Dao;

import java.util.List;

import com.spring.rest.Customer;

public interface CustomerDAO {
	List<Customer> getAllCustomer();
	List<Customer> getByID(int id);
}
