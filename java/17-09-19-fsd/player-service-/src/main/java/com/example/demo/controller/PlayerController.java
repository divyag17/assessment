package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.data.Player;
import com.example.demo.model.CreatePlayerRequestModel;
import com.example.demo.model.CreatePlayerResponseModel;

import com.example.demo.service.PlayerService;

import com.example.demo.shared.PlayerDto;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	@Autowired
	private PlayerService playerService;
	
	private  List < Player > list = new ArrayList < > ();
	

	 @GetMapping("/players")
	 public ResponseEntity < ? > getProsucts() {
		list= playerService.findAll();
			
			
	  return ResponseEntity.ok(list);

	 }
	@RequestMapping("/")
	public String home()
	{
		return "ok";
	}
	@PostMapping("/players")
	public ResponseEntity<CreatePlayerResponseModel> create(@RequestBody CreatePlayerRequestModel userDetail)
	{
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		PlayerDto uDto=mapper.map(userDetail, PlayerDto.class);
		
		PlayerDto tempDto=playerService.createUser(uDto);
		CreatePlayerResponseModel model=mapper.map(tempDto, CreatePlayerResponseModel.class);;
		return ResponseEntity.status(HttpStatus.CREATED).body(model);

	}
	@GetMapping("/player/{id}")
	 public ResponseEntity < ? > getProsucts(@PathVariable int id) {

	  Player product = findPlayer(id);
	  if (product == null) {
	   return ResponseEntity.badRequest()
	    .body("Invalid product Id");
	  }

	  return ResponseEntity.ok(product);

	 }

	 private Player findPlayer(int id) {
		// TODO Auto-generated method stub
		 return list.stream()
				   .filter(user -> user.getId()
				    .equals(id))
				   .findFirst()
				   .orElse(null);
	}
	

}
