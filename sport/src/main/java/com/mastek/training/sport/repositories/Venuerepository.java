package com.mastek.training.sport.repositories;


import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mastek.training.sport.entities.Venue;
@Component
@Scope("singleton")
public interface Venuerepository extends CrudRepository<Venue, Integer> {


	

}
