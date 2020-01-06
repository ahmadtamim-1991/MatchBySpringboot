package com.rab3.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rab3.entities.MatchEntity;

@Repository
@Transactional
public class MatchesRepository {
	
       private EntityManager manager;
       
	public MatchEntity saveMatch(MatchEntity entity) {
		
		return manager.merge(entity);
	}

	public EntityManager getManager() {
		return manager;
	}
   @PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	
	
}
