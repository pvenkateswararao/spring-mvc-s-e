package com.spring.mvc.formater;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.spring.mvc.entity.Phone;

public class PhoneNumberFormater implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		String s = object.getCode()+"-"+object.getMobile();
		return s;
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		System.out.println("Modile formater working");
		Phone phone = new Phone();
		String p[] = text.split("-");
		phone.setCode(p[0]);
		phone.setMobile(p[1]);
		return phone;
	}

}
