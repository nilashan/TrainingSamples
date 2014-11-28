package com.virtusa.salestracker.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.virtusa.salestracker.model.SalesType;

public interface SalesService {

	public abstract List<SalesType> getAllSalesTypes();

}