package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

 @Autowired
 DoctorServiceClient doctorServiceClient;
 
 @GetMapping("/fetchdoctor")
 public ResponseEntity <? > fetchProducts() {

  return ResponseEntity.ok(doctorServiceClient.getAllProducts());
 }

 @GetMapping("/fetchdoctor/{id}")
 public ResponseEntity < ? > fetchProduct(@PathVariable int id) {

  return ResponseEntity.ok(doctorServiceClient.getProduct(id));
 }
}