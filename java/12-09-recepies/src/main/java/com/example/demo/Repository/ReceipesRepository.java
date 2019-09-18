package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Receipes;


@Repository
public interface ReceipesRepository extends CrudRepository<Receipes,Long>{

	
}
