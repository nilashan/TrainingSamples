package com.virtusa.salestracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.virtusa.salestracker.model.Sales;

@Controller
public class SalesTracker {
	
	@RequestMapping(value="/greeting")
	public String sayGreeting(Model model){
		model.addAttribute("greetingMsg", "Hello Spring ur awesome");
		return "welcome";
	}
	
	
	@RequestMapping(value="/addSales")
	public String addSales(@ModelAttribute("salesValues") Sales sales ){
		System.out.println("Sales is " + sales.getSales());
		return "addSalesValue";
		
		
		
/*		if(sales.getSales() == null || sales.getSales() > 0){
			return "redirect:addBonusSales.html";
		}else{
			return "addSalesValue";
		}*/
	}
	
	
	
}