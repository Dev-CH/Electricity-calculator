
package com.chrishammer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chrishammer.model.Account;
import com.chrishammer.service.AccountService;

@Controller
public class CreateAccountController {

	@Autowired
	private AccountService accountService;
	
	
	@RequestMapping(value="/createAccount", method=RequestMethod.GET)
	public String createUser(Model model, @ModelAttribute("account") Account account) {
		return "createAccount";
	}
	
	@RequestMapping(value="/createAccount", method=RequestMethod.POST)
	public String submitUser(@Valid @ModelAttribute("account") Account account,BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "createAccount";
		}
		model.addAttribute("name", account.getFirstName());
		Account newAccount = account;
		accountService.save(newAccount);
		return "redirect:accountCreated.html";
	}
	
	@RequestMapping(value="/accountCreated")
	public String accountCreated(@ModelAttribute("name")String usersName) {	
		
		return "accountCreated";
}
}