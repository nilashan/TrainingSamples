package com.krishantha.salestracker.repository;

import java.util.List;

import com.krishantha.salestracker.model.SalesTarget;

public interface SalesTargetRepository {

	SalesTarget save(SalesTarget salesTarget);

	List<SalesTarget> loadAll();
}
