package com.example.demo.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.data.Player;
import com.example.demo.repository.PlayerRepository;

import com.example.demo.shared.PlayerDto;
@Service
public class PlayerServiceImpl implements PlayerService{
	private Environment env;
	private PlayerRepository playerrepository;
	
	@Autowired
	public PlayerServiceImpl(Environment env, PlayerRepository playerrepository) {
		super();
		this.env = env;
		this.playerrepository= playerrepository;
	}
	@Override
	public PlayerDto createUser(PlayerDto userDetail) {
		// TODO Auto-generated method stub
		userDetail.setuId(UUID.randomUUID().toString());
		ModelMapper mapper=new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		Player p=mapper.map(userDetail,Player.class);
		playerrepository.save(p);
		PlayerDto uDto=mapper.map(p, PlayerDto.class);
		
		return uDto;
	}

	@Override
	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return playerrepository.findAll();
	}

}
