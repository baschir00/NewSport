package com.mastek.training.sport.apis;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mastek.training.sport.entities.Venue;
import com.mastek.training.sport.repositories.Venuerepository;

@Component
@Scope("singleton")
public class Venueservice {
	


	@Autowired
	Venuerepository venueRepository;

	public Venueservice() {
		System.out.println("VenueServiceCreated");
	}	
	
	public Venue registerOrUpdateVenue(Venue ven) {
		ven = venueRepository.save(ven);
		System.out.println("Venue registered"+ven);
		return ven;
	}
	
public Venue findByEmpno(int venueId) {
		
		try {
			return venueRepository.findById(venueId).get();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	

	public void deleteByEmpno(int venueId) {
		 venueRepository.deleteById(venueId);
	}

	
	
	

}
