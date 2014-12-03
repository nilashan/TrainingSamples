package com.krishantha.salestracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.krishantha.salestracker.model.Sales;
import com.krishantha.salestracker.model.SalesType;
import com.krishantha.salestracker.repository.SalesRepository;

@Service("salesService")
public class SalesServiceImpl implements SalesService {
	
	@Autowired
	SalesRepository repository;
	
	public List<SalesType> getAllSalesTypes() {

		
		List<SalesType> list = new ArrayList<SalesType>();

		SalesType salesType = new SalesType();
		salesType.setSalesType("Direct");
		list.add(salesType);

		salesType = new SalesType();
		salesType.setSalesType("Web");
		list.add(salesType);

		salesType = new SalesType();
		salesType.setSalesType("Indirect");
		list.add(salesType);

		return list;
	}

	@Transactional
	public Sales save(Sales sales) {
		
		return repository.save(sales);
	}
}
