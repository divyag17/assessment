package com.example.demo.model;

public class CreateLeagueResponseModel {
	
	private String title;
	private String season;
	public CreateLeagueResponseModel(String title, String season) {
		super();
		this.title = title;
		this.season = season;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public CreateLeagueResponseModel() {
		super();
	}
	
}
