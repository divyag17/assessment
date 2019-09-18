package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "doctor-service")
public interface DoctorServiceClient {

 @RequestMapping(value = "/doctors", method = RequestMethod.GET)
 public List < Doctor > getAllProducts();

 @RequestMapping(value = "/doctor/{id}", method = RequestMethod.GET)
 public Doctor getProduct(@PathVariable("id") int productId);
 
 @RequestMapping(value = "/doctor/{specialist}", method = RequestMethod.GET)
 public Doctor getProduct(@PathVariable("specialist") String specialist);
}
