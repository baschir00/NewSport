package com.mastek.training.sport.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Entity 
@Table (name="JPA_PLAYERS")
@Scope("prototype")
public class Players implements Serializable{

	private int playerId;
	private String playerName;
	private int playerAge;
	private double playerSalary;
	private int goals;
	private Teams currentTeams;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getPlayerAge() {
		return playerAge;
	}
	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}
	public double getPlayerSalary() {
		return playerSalary;
	}
	public void setPlayerSalary(double playerSalary) {
		this.playerSalary = playerSalary;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	@ManyToOne
	@JoinColumn(name="FK_TeamId")
	public Teams getCurrentTeams() {
		return currentTeams;
	}
	public void setCurrentTeams(Teams currentTeams) {
		this.currentTeams = currentTeams;
	}
	
	
}
