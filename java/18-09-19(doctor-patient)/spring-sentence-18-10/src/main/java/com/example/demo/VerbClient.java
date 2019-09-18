package com.example.demo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("VERB")
public interface VerbClient {

	@GetMapping("/")
	Word getWord();
	
}