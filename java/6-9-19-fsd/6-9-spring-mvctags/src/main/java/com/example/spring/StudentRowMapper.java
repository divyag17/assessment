package com.example.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<student> {

	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		student s=new student();
		s.setId(rs.getString(1));
		s.setName(rs.getString(2));
		s.setFavoriteLanguage(rs.getString(4));
		s.setCountry(rs.getString(3));
		s.setOs("os");
		return s;
	}
}
