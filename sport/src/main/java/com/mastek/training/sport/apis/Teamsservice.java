package com.mastek.training.sport.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import com.mastek.training.sport.entities.Teams;
import com.mastek.training.sport.repositories.Teamsrepository;


@Component
@Scope("singleton")
public class Teamsservice {


	@Autowired
	Teamsrepository teamRepository;

	public Teamsservice() {
		System.out.println("TeamsServiceCreated");
	}	
	
	public Teams registerOrUpdateTeams(Teams tea) {
		tea = teamRepository.save(tea);
		System.out.println("Venue registered"+tea);
		return tea;
	}
	
public Teams findByEmpno(int teamId) {
		
		try {
			return teamRepository.findById(teamId).get();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	

	public void deleteByEmpno(int teamId) {
		 teamRepository.deleteById(teamId);
	}

	
	
}
