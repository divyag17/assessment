package com.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.Service.CustomerService;
import com.spring.entity.Customer;

@Controller
//@RequestMapping("/api")
public class CustomerController {
	@Autowired
	private CustomerService service;

	@GetMapping("/")
	public String showForm(Model theModel) {
		Customer customer = new Customer();
		theModel.addAttribute("customer", customer);
		return "index";
	}

	@PostMapping("/create")
	public String create(@ModelAttribute("customer") Customer theCustomer, Model theModel)

	{
		service.createCustomer(theCustomer);
		return "redirect:/";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("customer", theCustomer);
		
		return "customer-form";
	}
	@GetMapping("/list")
	public String list(Model theModel)

	{
		List<Customer> customer= service.getCustomers();
		theModel.addAttribute("customer", customer);
		return "list-customers";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id)

	{
		service.deleteCustomer(id);
		return "redirect:/list";
	}
}