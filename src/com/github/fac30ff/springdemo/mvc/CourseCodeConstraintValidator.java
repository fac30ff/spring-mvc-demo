package com.github.fac30ff.springdemo.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{
	private String[] coursePrefix;
	
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		coursePrefix = constraintAnnotation.value();
	}

	/*
	 * @Override public boolean isValid(String arg0, ConstraintValidatorContext
	 * arg1) { return arg0 != null ? arg0.startsWith(coursePrefix) : true; }
	 */
	@Override
	public boolean isValid(String code, ConstraintValidatorContext context) {
		boolean result = false;
		if (code != null) {
			for (String s: coursePrefix) {
				result = code.startsWith(s);
				if (result) {
					break;
				}
			}
		} else {
			result = true;
		}
		return result;
	}
}
