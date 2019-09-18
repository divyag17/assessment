package com.spring.rest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.Customer;
import com.spring.rest.Service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers()
	{
		return service.getAllCustomer();
	}
	
	@GetMapping("/customer/1")
	public List<Customer> getByID(int id)
	{
		return service.getByID(id);
	}
	
	
	
}