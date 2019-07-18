package com.mastek.training.sport.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Entity 
@Table (name="JPA_TEAMS")
@Scope("prototype")
public class Teams implements Serializable {
	
	private int teamId;
	private String teamName;
	private int teamRankings;
	
	
	private Set<Players> owners = new HashSet<>();
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTeamRankings() {
		return teamRankings;
	}
	public void setTeamRankings(int teamRankings) {
		this.teamRankings = teamRankings;
	}
	
	@OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="currentTeams")
	public Set<Players> getOwners() {
		return owners;
	}
	public void setOwners(Set<Players> owners) {
		this.owners = owners;
	}
	
	
}
