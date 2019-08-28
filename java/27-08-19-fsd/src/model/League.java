package model;

import java.io.Serializable;

public class League implements Serializable{
	public static int serialVersionUID=101;
	private String title;
	private String season;
	
	public League() {
		super();
	}
	public League(String title, String season) {
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
	
	
	
	
}
