package com.mastek.training.sport.repositories;

import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.mastek.training.sport.entities.Teams;
@Component
@Scope("singleton")
public interface Teamsrepository extends CrudRepository<Teams, Integer> {

}
