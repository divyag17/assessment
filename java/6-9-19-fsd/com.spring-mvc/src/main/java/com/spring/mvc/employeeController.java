package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class employeeController {

	@RequestMapping(method = RequestMethod.GET,name = "/showView")
	public String showForm()
	{
		return "form";
	}
//
//	@RequestMapping(method = RequestMethod.POST, name = "/formaction")
//	public String processForm()
//	{
//		return "hello";
//	}
	@RequestMapping(name = "/processFormVersion")
	public String processStudentFormVersion(@RequestParam("id") String id,@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName,@RequestParam("email") String email,
			Model theModel)
	
	{
		theModel.addAttribute("M", new employee(id,firstName,lastName,email));
		return "hello";
	}
}
