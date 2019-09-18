package com.example.demo.service;

import java.util.List;

import com.example.demo.data.League;
import com.example.demo.shared.LeagueDto;

public interface LeagueService {
	public LeagueDto createUser(LeagueDto userDetail);

	public List<League> findAll() ;
}
