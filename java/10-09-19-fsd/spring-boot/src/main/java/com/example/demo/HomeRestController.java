package com.example.demo;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class HomeRestController {
	@Autowired
	private CustomerDAO dao;
	
	@RequestMapping("/")
	public String gohome()
	{
		return "hello divyarani";
	}
	@Transactional
	@GetMapping("/customer")
	public List<Customer> getAllCustomers()
	{
		return dao.getAllCustomer();
	}
	@Transactional
	@PostMapping("/customer")
	public void create(@RequestBody Customer thecustomer)
	{
		 dao.createCustomer(thecustomer);
	}
}
