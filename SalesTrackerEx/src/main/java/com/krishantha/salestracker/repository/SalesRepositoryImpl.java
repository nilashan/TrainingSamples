package com.krishantha.salestracker.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.krishantha.salestracker.model.Sales;

@Repository("salesRepository")
public class SalesRepositoryImpl implements SalesRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Sales save(Sales sales) {
		
		entityManager.persist(sales);
		entityManager.flush();
		return sales;
	}

}
