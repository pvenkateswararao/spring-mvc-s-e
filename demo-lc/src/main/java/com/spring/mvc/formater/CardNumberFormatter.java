package com.spring.mvc.formater;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.spring.mvc.entity.Card;

public class CardNumberFormatter implements Formatter<Card> {

	@Override
	public String print(Card object, Locale locale) {
		String s=object.getFirstNumber()+"-"+object.getSecondNumber();
		System.out.println(s);
		return s;
	}

	@Override
	public Card parse(String text, Locale locale) throws ParseException {
		System.out.println("Card Parser");
		String s[] = text.split("-");
		Card c = new Card();
		c.setFirstNumber(s[0]);
		c.setSecondNumber(s[1]);
		return c;
	}

}
