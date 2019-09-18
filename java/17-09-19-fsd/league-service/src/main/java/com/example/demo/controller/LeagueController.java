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

import com.example.demo.data.League;

import com.example.demo.model.CreateLeagueRequestModel;
import com.example.demo.model.CreateLeagueResponseModel;
import com.example.demo.service.LeagueService;
import com.example.demo.shared.LeagueDto;


@RestController
public class LeagueController {
	@Autowired
	private LeagueService leagueService;
	
	private  List < League > list = new ArrayList < > ();
	

	 @GetMapping("/leagues")
	 public ResponseEntity < ? > getProsucts() {
		list= leagueService.findAll();
			
			
	  return ResponseEntity.ok(list);

	 }
	@RequestMapping("/")
	public String home()
	{
		return "ok";
	}
	@PostMapping("/leagues")
	public ResponseEntity<CreateLeagueResponseModel> create(@RequestBody CreateLeagueRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		LeagueDto uDto=mapper.map(userDetail, LeagueDto.class);
		
		LeagueDto tempDto=leagueService.createUser(uDto);
		CreateLeagueResponseModel model=mapper.map(tempDto, CreateLeagueResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	@GetMapping("/league/{id}")
	 public ResponseEntity < ? > getProsucts(@PathVariable int id) {

	  League product = findLeague(id);
	  if (product == null) {
	   return ResponseEntity.badRequest()
	    .body("Invalid product Id");
	  }

	  return ResponseEntity.ok(product);

	 }

	 private League findLeague(int id) {
		// TODO Auto-generated method stub
		 return list.stream()
				   .filter(user -> user.getId()
				    .equals(id))
				   .findFirst()
				   .orElse(null);
	}
	

}
