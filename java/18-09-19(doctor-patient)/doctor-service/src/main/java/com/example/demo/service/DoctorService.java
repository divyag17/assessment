package com.example.demo.service;

import java.util.List;

import com.example.demo.data.Doctor;
import com.example.demo.shared.DoctorDto;



public interface DoctorService {
	public DoctorDto createUser(DoctorDto userDetail);

	public List<Doctor> findAll() ;
	public List<Doctor> findAllbySpeciality(String spl);
}
