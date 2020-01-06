package com.rab3.entities;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matches")
public class MatchEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "date")
	private Date date;
	@Column(name = "location")
	private String location;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "home_team")
	private TeamEntity homeTeam;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "away_team")
	private TeamEntity awayTeam;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public TeamEntity getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(TeamEntity homeTeam) {
		this.homeTeam = homeTeam;
	}

	public TeamEntity getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(TeamEntity awayTeam) {
		this.awayTeam = awayTeam;
	}

}
