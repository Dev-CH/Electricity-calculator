
package com.chrishammer.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.chrishammer.service.AccountService;

public class UserNameConstraintValidator implements ConstraintValidator<UserName, String> {
	@Autowired
	private AccountService accountService;
	
	public void initialize(UserName userName) {

	}
	public boolean isValid(String userName, ConstraintValidatorContext cxt) {
			
		if(accountService.checkForUser(userName)) {
			return false;
		}
		else
			return true;
			/*userName.matches("^[a-zA-Z0-9]+([a-zA-Z0-9](_|-| )[a-zA-Z0-9])*[a-zA-Z0-9]+$")*/
	}
}