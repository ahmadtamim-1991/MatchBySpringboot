package com.rab3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rab3.dtos.MatchDto;
import com.rab3.entities.MatchEntity;
import com.rab3.services.MatchService;

@RestController
@RequestMapping("match")
public class MatchController {

	@Autowired
	private MatchService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public MatchEntity createMatch(@RequestBody MatchDto dto) {
		
		return service.createMatch(dto);
	}
}
