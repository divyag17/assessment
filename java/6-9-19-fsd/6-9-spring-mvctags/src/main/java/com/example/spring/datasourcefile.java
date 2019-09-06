package com.example.spring;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.stereotype.Component;

@Component(value="dataSource")
public class datasourcefile extends BasicDataSource{

	@PostConstruct
	public void init()
	{
		setUsername("root");
		setPassword("root");
		setUrl("jdbc:mysql://localhost:3306/db");
		setDriverClassName("com.mysql.jdbc.Driver");
	}
}
