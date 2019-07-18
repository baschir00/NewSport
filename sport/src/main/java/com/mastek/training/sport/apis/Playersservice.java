package com.mastek.training.sport.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.training.sport.entities.Players;

import com.mastek.training.sport.repositories.Playersrepository;

@Component
@Scope("singleton")
public class Playersservice {
	
	@Autowired
	Playersrepository playersRepository;

	public Playersservice() {
		System.out.println("TeamsServiceCreated");
	}	
	
	public Players registerOrUpdateTeams(Players pla) {
		pla = playersRepository.save(pla);
		System.out.println("Players registered"+pla);
		return pla;
	}
	
public Players findByEmpno(int playerId) {
		
		try {
			return playersRepository.findById(playerId).get();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	

	public void deleteByEmpno(int playerId) {
		 playersRepository.deleteById(playerId);
	}


}
