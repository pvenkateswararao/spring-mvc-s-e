package com.spring.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.spring.mvc.annotation.Age;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	public int minLimit, maxLimit;
	
	@Override
	public void initialize(Age age) {
		minLimit = age.min();
		maxLimit = age.max();
	}
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if(value>minLimit && value<maxLimit)
			return true;
			
		return false;
	}

}
