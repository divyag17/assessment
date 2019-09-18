package com.example.demo.service;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.data.Doctor;

import com.example.demo.repository.DoctorRepository;
import com.example.demo.shared.DoctorDto;


@Service
public class DoctorServiceImpl implements DoctorService {
	private Environment env;
	private DoctorRepository doctorrepository;
	
	@Autowired
	public DoctorServiceImpl(Environment env, DoctorRepository doctorrepository) {
		super();
		this.env = env;
		this.doctorrepository = doctorrepository;
	}
	
	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return doctorrepository.findAll();
	}

	@Override
	public DoctorDto createUser(DoctorDto userDetail) {
		// TODO Auto-generated method stub
		userDetail.setuId(UUID.randomUUID().toString());
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Doctor doctor=mapper.map(userDetail,Doctor.class);
		doctorrepository.save(doctor);
		DoctorDto uDto=mapper.map(doctor, DoctorDto.class);
		
		return uDto;
	}

	@Override
	public List<Doctor> findAllbySpeciality(String spl) {
		// TODO Auto-generated method stub
		return  doctorrepository.findAllBySpeciality(spl);
	}
	

}
