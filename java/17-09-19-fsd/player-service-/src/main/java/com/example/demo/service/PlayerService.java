package com.example.demo.service;

import java.util.List;

import com.example.demo.data.Player;
import com.example.demo.shared.PlayerDto;

public interface PlayerService {
	public PlayerDto createUser(PlayerDto userDetail);

	public List<Player> findAll() ;
}
