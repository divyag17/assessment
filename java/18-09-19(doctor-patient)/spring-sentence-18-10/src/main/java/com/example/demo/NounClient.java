package com.example.demo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("NOUN")
public interface NounClient {

	@GetMapping("/")
	Word getWord();
	
}