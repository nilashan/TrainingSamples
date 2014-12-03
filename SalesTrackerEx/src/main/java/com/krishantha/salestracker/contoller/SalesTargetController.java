package com.krishantha.salestracker.contoller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.krishantha.salestracker.model.SalesTarget;
import com.krishantha.salestracker.service.SalesTargetService;

@Controller
@SessionAttributes("addTarget")
public class SalesTargetController {

	@Autowired
	private SalesTargetService salesTargetService;
	
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
			System.out.println("Process terminated by error");
			return "addSalesTarget";
		}else{
			salesTargetService.save(salesTarget);
		}
		System.out.println("Target Updated "
				+ salesTarget.getSalesTargetValue());

		return "redirect:index.jsp";

	}
	

	@RequestMapping(value = "/getTarget", method = RequestMethod.GET)
	public String addTargets(Model model) {

		List<SalesTarget> targets = salesTargetService.findAllTargets();
		model.addAttribute("targets", targets);
		return "getTarget";

	}
	
	

}
