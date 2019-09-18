package com.example.demo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient("ARTICLE")
public interface ArticleClient {

	@GetMapping("/")
	Word getWord();

}