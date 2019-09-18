package com.example.demo.service;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.data.League;
import com.example.demo.repository.LeagueRepository;
import com.example.demo.shared.LeagueDto;

@Service
public class LeagueServiceImpl implements LeagueService {
	private Environment env;
	private LeagueRepository leaguerepository;
	
	@Autowired
	public LeagueServiceImpl(Environment env, LeagueRepository leaguerepository) {
		super();
		this.env = env;
		this.leaguerepository = leaguerepository;
	}
	
	public LeagueDto createUser(LeagueDto userDetail) {
		// TODO Auto-generated method stub
		userDetail.setuId(UUID.randomUUID().toString());
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		League league=mapper.map(userDetail,League.class);
		leaguerepository.save(league);
		LeagueDto uDto=mapper.map(league, LeagueDto.class);
		
		return uDto;
	}

	@Override
	public List<League> findAll() {
		// TODO Auto-generated method stub
		return leaguerepository.findAll();
	}
	

}
