
package com.chrishammer.view;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordConstraintValidator implements ConstraintValidator<Password, String> {

	public void initialize(Password password) {
		
	}
	
	public boolean isValid(String passwordField, ConstraintValidatorContext cxt) {
		
		if( passwordField == null) {
			return false;
		}
		
		return passwordField.matches("(?!^[0-9]*$)(?!^[a-zA-Z]*$)^([a-zA-Z0-9]{6,15})$");
	}
	
	
	
	
}