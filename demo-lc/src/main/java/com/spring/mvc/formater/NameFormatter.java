package com.spring.mvc.formater;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

public class NameFormatter implements Formatter<String> {

	@Override
	public String print(String object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String parse(String text, Locale locale) throws ParseException {
		String s = text.toUpperCase();
		return s;
	}

}
