package com.krishantha.salestracker.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.krishantha.salestracker.model.SalesTarget;

@Repository("salesTargetRepository")
public class SalesTargetRepositoryImpl implements SalesTargetRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public SalesTarget save(SalesTarget salesTarget) {
		
		entityManager.persist(salesTarget);
		entityManager.flush();
		return salesTarget;
		
	}

	public List<SalesTarget> loadAll() {
		
		Query query = entityManager.createQuery("select t from SalesTarget t");
		
		List<SalesTarget> targets = query.getResultList();
		
		return targets;
	}

}
