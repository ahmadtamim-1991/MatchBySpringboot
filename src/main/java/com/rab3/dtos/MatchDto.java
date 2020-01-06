package com.rab3.dtos;

import java.util.Date;

public class MatchDto {
	
	private Date date;
	private String location;
	private Long awayTeam;
	private Long homeTeam;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getAwayTeam() {
		return awayTeam;
	}
	public void setAwayTeam(Long awayTeam) {
		this.awayTeam = awayTeam;
	}
	public Long getHomeTeam() {
		return homeTeam;
	}
	public void setHomeTeam(Long homeTeam) {
		this.homeTeam = homeTeam;
	}

}
