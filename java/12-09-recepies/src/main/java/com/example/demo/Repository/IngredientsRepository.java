package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Ingredients;

@Repository
public interface IngredientsRepository extends CrudRepository<Ingredients,Long>{

}
