package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableDiscoveryClient
public class SpringGalleryServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGalleryServicesApplication.class, args);
	}
	@Configuration
	class RestTemplateConfig
	{
		@Bean
		@LoadBalanced
		public RestTemplate restTemplate()
		{
			return new RestTemplate();
		}
	}

}
