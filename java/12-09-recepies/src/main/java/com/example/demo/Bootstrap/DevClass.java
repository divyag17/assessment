package com.example.demo.Bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.Repository.IngredientsRepository;
import com.example.demo.Repository.NotesRepository;
import com.example.demo.Repository.ReceipesRepository;
import com.example.demo.entity.*;

@Component
public class DevClass implements ApplicationListener<ContextRefreshedEvent> {
	
	IngredientsRepository ingredientsRepository;
	NotesRepository notesRepository;
	ReceipesRepository receipesRepository;
	
	@Autowired
	public DevClass(IngredientsRepository ingredientsRepository, NotesRepository notesRepository,
			ReceipesRepository receipesRepository) {
		super();
		this.ingredientsRepository = ingredientsRepository;
		this.notesRepository = notesRepository;
		this.receipesRepository = receipesRepository;
	}


	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
		
	}


	private void init() {
		// TODO Auto-generated method stub
		
		Notes n=new Notes("dont eat too much");
		Receipes r=new Receipes("Chicken fry","30mins","medium","mix ","ramyacooking.com");
	Ingredients i=new Ingredients("200","Chicken,masala,salt,oil",r);
//		
//	r.setNotes(n);
//	i.setReceipes(r);
//	n.setReceipes(r);
////		
		receipesRepository.save(r);
		ingredientsRepository.save(i);
		notesRepository.save(n);
		
		Notes n1=new Notes("its a good starter");
		Receipes r1=new Receipes("soup","5mins","easy","boil water and add mix","ramyacooking.com");
	Ingredients i1=new Ingredients("50","water,mix");
		
//r1.setNotes(n1);
//	i1.setReceipes(r1);
//	n1.setReceipes(r1);
//		
		receipesRepository.save(r1);
		ingredientsRepository.save(i1);
		notesRepository.save(n1);
		
	}
	
	
}
