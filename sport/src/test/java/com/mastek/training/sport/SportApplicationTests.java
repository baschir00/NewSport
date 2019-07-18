package com.mastek.training.sport;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mastek.training.sport.apis.Playersservice;
import com.mastek.training.sport.apis.Teamsservice;
import com.mastek.training.sport.apis.Venueservice;
import com.mastek.training.sport.entities.Players;
import com.mastek.training.sport.entities.Teams;
import com.mastek.training.sport.entities.Venue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SportApplicationTests {

	@Autowired
	Venueservice venueService;
	
	@Autowired
	Teamsservice teamService;
	
	@Autowired
	Teams tea;
	
	@Autowired
	Venue ven;
	
	@Autowired
	Players pla;
	
	@Autowired
	Playersservice playerService;
	
	
//	@Test
//	public void addVenueUsingService() {
//		
//		ven.setVenueId(1);
//		ven.setVenueLocation("Manchester");
//		ven.setVenueName("Old Trafford");
//		ven = venueService.registerOrUpdateVenue(ven);
//		assertNotNull(ven);
//		
//	}
//	
//	@Test
//	public void addTeamUsingService() {
//		
//		tea.setTeamId(3);
//		tea.setTeamName("Manchester United");
//		tea.setTeamRankings(1);
//		tea = teamService.registerOrUpdateTeams(tea);
//		assertNotNull(tea);
//		
//	}
//	
//	
//	@Test
//	public void addPlayersUsingService() {
//		
//		pla.setPlayerId(4);
//		pla.setPlayerName("Lukaku");
//		pla.setPlayerAge(26);
//		pla.setGoals(2);
//		pla.setPlayerSalary(100.584);
//		pla = playerService.registerOrUpdateTeams(pla);
//		assertNotNull(pla);
//		
//	}
	
	@Test
	public void manageAssociations() {
		
		Teams t1 = new Teams();
		t1.setTeamName("Chelsea");
		t1.setTeamRankings(3);
		
//		Teams t2 = new Teams();
//		t2.setTeamName("Arsenal");
//		t2.setTeamRankings(4);
		
		Players p1 = new Players();
		p1.setPlayerName("Willian");
		p1.setPlayerAge(28);
		p1.setGoals(3);
		p1.setPlayerSalary(300.584);
		
		Players p2 = new Players();
		p2.setPlayerName("Pedro");
		p2.setPlayerAge(36);
		p2.setGoals(8);
		p2.setPlayerSalary(100.414);
		
		t1.getOwners().add(p1);
		t1.getOwners().add(p2);
		
		p1.setCurrentTeams(t1);
		p2.setCurrentTeams(t1);
		
		teamService.registerOrUpdateTeams(t1);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
