package com.mastek.training.sport.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mastek.training.sport.entities.Players;

public interface Playersrepository extends CrudRepository<Players, Integer>{

}
