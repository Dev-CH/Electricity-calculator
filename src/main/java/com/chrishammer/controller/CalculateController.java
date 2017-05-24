
package com.chrishammer.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chrishammer.model.Account;
import com.chrishammer.model.AccountReport;
import com.chrishammer.service.CalculateService;

@Controller
@SessionAttributes({"userName"})
public class CalculateController {
	
	@Autowired
	private CalculateService calculateService;
	
	@RequestMapping(value="/calculate", method=RequestMethod.GET)
	public String getResults (@RequestParam("provider")String provider, @ModelAttribute("userName") Account user, Model model) {	
		BigDecimal finalCost = calculateService.calculateCosts(provider, user.getId());				// get access to provider DB
		model.addAttribute("finalCost", finalCost);
		List<AccountReport> accountReport = calculateService.getCostBreakdown(user.getId(), provider);
		model.addAttribute("accountReports", accountReport);
		return "finalCost";
		
	}
	
}