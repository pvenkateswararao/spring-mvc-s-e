package com.spring.mvc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.mvc.entity.UserDetails;

public class NameSpringValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserDetails.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "subject", "subject.Empty", "subject cant be empty");
		
		String s = ((UserDetails)target).getSubject();
		if(!s.contains("_")) {
			errors.rejectValue("subject", "subject.__error", "subject should contains '_'");
		}
	}

}
