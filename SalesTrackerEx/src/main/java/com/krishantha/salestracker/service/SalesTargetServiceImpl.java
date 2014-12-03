package com.krishantha.salestracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krishantha.salestracker.model.SalesTarget;
import com.krishantha.salestracker.repository.SalesTargetRepository;

@Service("salesTargetService")
public class SalesTargetServiceImpl implements SalesTargetService {

	@Autowired
	SalesTargetRepository repository;
	
	@Transactional
	public SalesTarget save(SalesTarget salesTarget) {
		
		return repository.save(salesTarget);
	}

	
	public List<SalesTarget> findAllTargets() {
		
		return repository.loadAll();
	}

	
}
