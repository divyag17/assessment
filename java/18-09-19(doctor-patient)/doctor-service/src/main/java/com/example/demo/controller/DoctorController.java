package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.data.Doctor;

import com.example.demo.model.CreateDoctorRequestModel;
import com.example.demo.model.CreateDoctorResponseModel;
import com.example.demo.repository.DoctorRepository;
import com.example.demo.service.DoctorService;
import com.example.demo.shared.DoctorDto;


@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	private DoctorRepository doctorrepository;;
	
	private  List < Doctor > list = new ArrayList < > ();
	

	 @GetMapping("/doctors")
	 public ResponseEntity < ? > getProsucts() {
		list= doctorService.findAll();
			
			
	  return ResponseEntity.ok(list);

	 }
	@RequestMapping("/")
	public String home()
	{
		return "ok";
	}
	@PostMapping("/doctors")
	public ResponseEntity<CreateDoctorResponseModel> create(@RequestBody CreateDoctorRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		DoctorDto uDto=mapper.map(userDetail, DoctorDto.class);
		
		DoctorDto tempDto=doctorService.createUser(uDto);
		CreateDoctorResponseModel model=mapper.map(tempDto, CreateDoctorResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	@GetMapping("/doctor/{id}")
	 public ResponseEntity < ? > getProsucts(@PathVariable int id) {

	  Doctor product = findDoctor(id);
	  if (product == null) {
	   return ResponseEntity.badRequest()
	    .body("Invalid product Id");
	  }

	  return ResponseEntity.ok(product);

	 }
	@GetMapping("/doctor/{specialist}")
	 public ResponseEntity < ? > getProsucts(@PathVariable String specialist){

	  Doctor product = findDoctor(specialist);
	  if (product == null) {
	   return ResponseEntity.badRequest()
	    .body("no doctor");
	  }

	  return ResponseEntity.ok(product);

	 }
	 private Doctor findDoctor(String specialist) {
		// TODO Auto-generated method stub
		 return list.stream()
				   .filter(user -> user.getSpecialist()
				    .equals(specialist))
				   .findFirst()
				   .orElse(null);
	}
	private Doctor findDoctor(int id) {
		// TODO Auto-generated method stub
		 return list.stream()
				   .filter(user -> user.getId()
				    .equals(id))
				   .findFirst()
				   .orElse(null);
	}
	

}
