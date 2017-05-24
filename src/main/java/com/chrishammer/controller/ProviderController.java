package com.chrishammer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProviderController {

	@RequestMapping(value="/provider", method=RequestMethod.GET)
	public String getProvider (Model model) {
		return "chooseProvider";
	}
}
