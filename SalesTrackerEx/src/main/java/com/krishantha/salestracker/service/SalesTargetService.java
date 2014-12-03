package com.krishantha.salestracker.service;

import java.util.List;

import com.krishantha.salestracker.model.SalesTarget;

public interface SalesTargetService {

	SalesTarget save(SalesTarget salesTarget);

	List<SalesTarget> findAllTargets();
}
