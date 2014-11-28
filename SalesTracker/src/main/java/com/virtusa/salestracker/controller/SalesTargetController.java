package com.virtusa.salestracker.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.virtusa.salestracker.model.SalesTarget;

@Controller
@SessionAttributes("addTarget")
public class SalesTargetController {

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
}