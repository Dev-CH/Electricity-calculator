
package com.chrishammer.view;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=UserNameConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UserName {
	
	String message() default "{UserName}";		// refers to key inside message.properties
	
	Class<?>[] groups() default {};				// not sure what this does, google it.
	
	Class<? extends Payload>[] payload() default{};		//passes in values assosiated with annotation

}