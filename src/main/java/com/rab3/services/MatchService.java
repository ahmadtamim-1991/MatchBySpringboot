package com.rab3.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rab3.dtos.MatchDto;
import com.rab3.entities.MatchEntity;
import com.rab3.entities.TeamEntity;
import com.rab3.repositories.MatchesRepository;
import com.rab3.repositories.TeamRepository;

@Service
public class MatchService {

	@Autowired
	private MatchesRepository repository;
	@Autowired
	private TeamRepository teamReapository;

	public MatchEntity createMatch(MatchDto dto) {

		TeamEntity hometeam, awayteam;

		hometeam = teamReapository.getById(dto.getHomeTeam());
		awayteam = teamReapository.getById(dto.getAwayTeam());

		MatchEntity entity = convertMatch(dto);

		entity.setAwayTeam(awayteam);
		entity.setHomeTeam(hometeam);

		return repository.saveMatch(entity);
	}

	public MatchEntity convertMatch(MatchDto dto) {
		MatchEntity entity = null;
		if (dto != null) {
			entity = new MatchEntity();
			entity.setDate(dto.getDate());
			entity.setLocation(dto.getLocation());
		}
		return entity;
	}

}
