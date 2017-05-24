
package com.chrishammer.view;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=PasswordConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
	
	String message() default "{Password}";		// refers to key inside message.properties
	
	Class<?>[] groups() default {};				//
	
	Class<? extends Payload>[] payload() default{};		//how to pass in values assosiated with annotation

}