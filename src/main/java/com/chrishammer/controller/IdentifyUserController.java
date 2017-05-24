
package com.chrishammer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.chrishammer.model.Account;
import com.chrishammer.model.LoginAttempt;
import com.chrishammer.service.AccountService;

@Controller
@SessionAttributes({"userName", "counter"})
public class IdentifyUserController {

	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String loginDetails(@ModelAttribute("loginAttempt")LoginAttempt loginAttempt, Model model) {
		model.addAttribute("error", "");		
		return "logIn";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String processLogin (@ModelAttribute LoginAttempt loginAttempt, Model model) {
		String userName = loginAttempt.getUserName();
		String password = loginAttempt.getPassword();
		//checks to see if userName exists and returns true/false.
		boolean userExists = accountService.checkForUser(userName);
		
		if (userExists == true) {
			Account userSession = accountService.getUser(userName);				//if exists, gets that user from the DB
			//check if userName & password are correct
				if (password.equals(userSession.getPassword())) {					//if password matches stored password, redirects to selection.html
					model.addAttribute("userName", userSession);		
					return "redirect:selection.html";
				}
		}
		//if either of the above fails it will update a model atribute with an error message, and allow another attempt.
		model.addAttribute("error", "Your Password or Username are incorrect, please try again.");
		return "logIn";
	}
}		

		
		
	
		/*else {
			newUser.setUserName(userName);
			model.addAttribute("userName", newUser);
			System.out.println("creating a new user based off the original input");
			householdService.save(newUser);													//check for if userName & password are correct
		}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@RequestMapping(value="/gettingStarted", method=RequestMethod.POST)
	public String loggedIn(Model model, @ModelAttribute("loginAttempt")LoginAttempt loginAttempt, @ModelAttribute("userName") Household user) {
		
		user.setUserName(loginAttempt.getUserName());									//check if userName exists, if true. check if password matches. 
																						//if userName does not match create new userName and set password
		householdService.save(user);													//check for if userName & password are correct
		model.addAttribute("userName", user);
	
		System.out.println("POST complete - loggedIn");
		return "redirect:selection.html";
	}
	
	@RequestMapping(value="/getReport", method=RequestMethod.GET)
	public String getReports(Model model, HttpSession session, @ModelAttribute("userName") Household user, @ModelAttribute("counter") int counter) {
		List<HouseholdReport> householdReports = householdService.displayAllHouseholdReports(user.getId(), counter);
		model.addAttribute("householdReports", householdReports);
		
		return "getListReport";
	}
	*/
	
	/*@RequestMapping(value="/gettingStarted")
	public String getUser(@ModelAttribute("loginAttempt")LoginAttempt loginAttempt, Model model) {
		Household userSession = new Household();
		
		System.out.println("login attempt user : " + loginAttempt.getUserName());
		System.out.println("long attempt pword : " + loginAttempt.getPassword());
		
		model.addAttribute("userName", userSession);
		userSession.setUserName(loginAttempt.getUserName());
	
		System.out.println("save complete " + userSession.getUserName() + " saved to session");
		
		householdService.save(userSession);
		
		
		
		
		System.out.println("GET complete - getUser");
		return "redirect:selection.html";
	}*/