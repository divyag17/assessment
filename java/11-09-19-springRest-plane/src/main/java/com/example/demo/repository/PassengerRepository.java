package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Passenger;
@Repository
public interface PassengerRepository extends CrudRepository<Passenger,Long> {

}
