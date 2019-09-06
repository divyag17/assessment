package com.example.spring;

import java.sql.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class student {
private String id;
private String country;
private String name;
private String os;
private LinkedHashMap<String, String> countryOptions;

private String favoriteLanguage;



public student(String id, String name,String country,   String favoriteLanguage,String os) {
	super();
	this.id = id;
	this.country = country;
	this.name = name;
	this.os = os;
	this.favoriteLanguage = favoriteLanguage;
}



@Override
public String toString() {
	return "student [id=" + id + ", country=" + country + ", name=" + name + ", os=" 
			+ ", favoriteLanguage=" + favoriteLanguage + "]";
}



public String getOs() {
	return os;
}





public student() {
	
	// populate country options: used ISO country code
	countryOptions = new LinkedHashMap<String, String>();
	
	countryOptions.put("BR", "Brazil");
	countryOptions.put("FR", "France");
	countryOptions.put("DE", "Germany");
	countryOptions.put("IN", "India");
	countryOptions.put("US", "United States of America");		

}


public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}


public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
	this.countryOptions = countryOptions;
}



public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}
public String getFavoriteLanguage() {
	return favoriteLanguage;
}

public void setFavoriteLanguage(String favoriteLanguage) {
	this.favoriteLanguage = favoriteLanguage;
}



public void setOs(String string) {
	this.os = string;
}



}
