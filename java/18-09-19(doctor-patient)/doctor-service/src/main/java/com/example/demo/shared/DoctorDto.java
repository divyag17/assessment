package com.example.demo.shared;

public class DoctorDto {
	private String name;
	private String specialist;
	private String uId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public DoctorDto(String name, String specialist, String uId) {
		super();
		this.name = name;
		this.specialist = specialist;
		this.uId = uId;
	}
	public DoctorDto() {
		super();
	}
	
}
