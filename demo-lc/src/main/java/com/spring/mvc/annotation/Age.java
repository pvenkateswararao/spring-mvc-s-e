package com.spring.mvc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.spring.mvc.validator.AgeValidator;


@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {
	int max() default 100;
	int min()	default 0;
	String message() default "{ageValidationMessage}";
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}
