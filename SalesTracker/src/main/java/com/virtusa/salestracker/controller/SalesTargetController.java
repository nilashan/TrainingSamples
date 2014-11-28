package com.virtusa.salestracker.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.virtusa.salestracker.model.SalesTarget;
import com.virtusa.salestracker.model.SalesType;
import com.virtusa.salestracker.service.SalesService;

@Controller
@SessionAttributes("addTarget")
public class SalesTargetController {
	
	@Autowired
	private SalesService salesService;

	@RequestMapping(value = "addTarget", method = RequestMethod.GET)
	public String addSalesTarget(Model model) {

		SalesTarget salesTarget = new SalesTarget();
		salesTarget.setSalesTargetValue(81000);

		model.addAttribute("addTarget", salesTarget);
		return "addSalesTarget";

	}

	@RequestMapping(value = "addTarget", method = RequestMethod.POST)
	public String updateSalesTarget(
			@Valid @ModelAttribute("addTarget") SalesTarget salesTarget,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("Process Terminated");
			return "addSalesTarget";
		}
		/*
		 * System.out.println(" Error status is:"+bindingResult.hasErrors());
		 * System
		 * .out.println("Target updated "+salesTarget.getSalesTargetValue());
		 */

		System.out.println("Target updated is "
				+ salesTarget.getSalesTargetValue());

		return "redirect:addSales.html";

	}
	
	@RequestMapping(value="/salesTypes", method=RequestMethod.GET)
	public @ResponseBody List<SalesType> getAllSalesTypes(){
		return salesService.getAllSalesTypes();
	}
}
