package com.virtusa.salestracker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtusa.salestracker.model.SalesType;

@Service("salesService")
public class SalesServiceImpl implements SalesService {
	
	/* (non-Javadoc)
	 * @see com.virtusa.salestracker.service.SalesService#getAllSalesTypes()
	 */
	@RequestMapping(value="/salesTypes", method=RequestMethod.GET)
	public @ResponseBody List<SalesType> getAllSalesTypes(){
		
		List<SalesType> list=new ArrayList<SalesType>();
		SalesType salesType=new SalesType();
		salesType.setSalesTypes("Direct");
		list.add(salesType);
		
		SalesType web=new SalesType();
		web.setSalesTypes("web");
		list.add(web);
		

		SalesType shop=new SalesType();
		shop.setSalesTypes("shop");
		list.add(shop);
		
		return list;
	}

}
