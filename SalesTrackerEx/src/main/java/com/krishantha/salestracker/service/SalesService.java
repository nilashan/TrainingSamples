package com.krishantha.salestracker.service;

import java.util.List;

import com.krishantha.salestracker.model.Sales;
import com.krishantha.salestracker.model.SalesType;

public interface SalesService {

	List<SalesType> getAllSalesTypes();
	Sales save(Sales sales);

}