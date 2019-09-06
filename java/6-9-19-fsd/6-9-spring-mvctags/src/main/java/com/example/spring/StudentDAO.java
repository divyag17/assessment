package com.example.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


public class StudentDAO {
	 @Autowired
	 JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void createEmployee(student student)
	{
		String query="insert into student(id,name,country,FavoriteLanguage,os) values(?,?,?,?,?)";
		Object obj[]= {student.getId(),student.getName(),student.getCountry(),student.getFavoriteLanguage(),student.getOs()};
		jdbcTemplate.update(query,obj);
		System.out.println("done");
	}
	public void deleteEmployee(int id)
	{
		String query="delete from student where id=(?)";
		Object obj[]= {id};
		jdbcTemplate.update(query,obj);
		System.out.println("delete done");
	}
	public List<student> getAllEmployee()
	{
		return jdbcTemplate.query("select * from student", new StudentRowMapper());
	}
	
}
