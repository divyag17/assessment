package com.example.demo.shared;

public class LeagueDto {
	private String title;
	private String season;
private String uId;
	
	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
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
	public void setSeaon(String season) {
		this.season = season;
	}
	public LeagueDto(String title, String season) {
		super();
		this.title = title;
		this.season = season;
	}
	public LeagueDto() {
		super();
	}
	
}
