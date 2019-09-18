package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Repository.ReceipesRepository;
import com.example.demo.entity.Receipes;


@Controller
public class HomeController {
	
private ReceipesRepository receipesRepository;
	
	
	

	public HomeController(ReceipesRepository receipesRepository) {
	super();
	this.receipesRepository = receipesRepository;
}


	@GetMapping("/add")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Receipes receipe= new Receipes();
		theModel.addAttribute("receipes", receipe);
		
		return "receipes-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("receipes") Receipes receipe) {
		
		// save the employee
		receipesRepository.save(receipe);
		// use a redirect to prevent duplicate submissions
		return "redirect:/receipes";
	}
	

	@RequestMapping("/receipes")
	public String getAllBooks(Model theModel)
	{
		theModel.addAttribute("receipes",receipesRepository.findAll());
		return "receipe";
	}
}
