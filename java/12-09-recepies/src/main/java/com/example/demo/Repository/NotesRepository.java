package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Notes;

@Repository
public interface NotesRepository extends CrudRepository<Notes, Long>{

}
