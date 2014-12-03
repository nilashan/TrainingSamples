package com.krishantha.salestracker.contoller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.krishantha.salestracker.model.Sales;
import com.krishantha.salestracker.model.SalesTarget;
import com.krishantha.salestracker.model.SalesType;
import com.krishantha.salestracker.service.SalesService;

@Controller
public class SalesController {

	@Autowired
	private SalesService salesService;

	@RequestMapping(value = "/greeting")
	public String sayGreeting(Model model) {
		model.addAttribute("greetingMsg", "Hello Spring ur awsome");
		return "welcome";
	}

	@RequestMapping(value = "addSales")
	public String addSales(@Valid @ModelAttribute("salesValues") Sales sales, BindingResult bindingResult, HttpSession httpSession) {
		
		
		
		if(bindingResult.hasErrors()){
			System.out.println("Validation fail");
			return "addSalesValue";
		}else{
			
			SalesTarget salesTarget = (SalesTarget) httpSession.getAttribute("addTarget");
			sales.setSalesTarget(salesTarget);
			salesService.save(sales);
		}


		return "addSalesValue";
		/*
		 * if(sales.getSales()!=null && sales.getSales()>0){ return
		 * "redirect:addBonusSales.html"; }else{ return "addSalesValue"; }
		 */
		
		

	}

	@RequestMapping(value = "addBonusSales")
	public String addBonusSales(@ModelAttribute("salesValues") Sales sales) {
		System.out.println(" Bonus Sale is " + sales.getSales());
		return "addSalesValue";
	}

	@RequestMapping(value = "/salesTypes", method = RequestMethod.GET)
	public @ResponseBody
	List<SalesType> getAllSalesTypes() {

		return salesService.getAllSalesTypes();
	}
}
