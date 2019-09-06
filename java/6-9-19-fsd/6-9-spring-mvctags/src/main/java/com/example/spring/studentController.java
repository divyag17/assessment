package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class studentController {
	@Autowired
	private StudentDAO dao;
	@GetMapping("/showForm")
	public String showform(Model themodel)
	{	student s=new student();
		themodel.addAttribute("student",s);
		return "form";
	}
	@PostMapping("/processform")
	public String processform(@ModelAttribute("student") student thestudent,Model model)
	{	model.addAttribute("temp",thestudent);
		
    	dao.createEmployee(new student(thestudent.getId(),thestudent.getName(),thestudent.getCountry(),thestudent.getFavoriteLanguage(),thestudent.getOs()));
		
		return "details";
	}
}
