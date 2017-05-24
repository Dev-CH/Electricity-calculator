
package com.chrishammer.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidUserConstraintValidator implements ConstraintValidator<ValidUser, String> {
	
	public void initialize(ValidUser validUser) {

	}
	public boolean isValid(String validUser, ConstraintValidatorContext cxt) {
			
		return validUser.matches("^(?=.{3,16}$)[a-zA-Z0-9]+([a-zA-Z0-9](_|-| )[a-zA-Z0-9])*[a-zA-Z0-9]+$");
								 
	}
}