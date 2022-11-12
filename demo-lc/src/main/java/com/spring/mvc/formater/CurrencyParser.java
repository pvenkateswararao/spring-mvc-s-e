package com.spring.mvc.formater;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.spring.mvc.entity.BankCurrency;

public class CurrencyParser implements Formatter<BankCurrency>{

	@Override
	public String print(BankCurrency object, Locale locale) {
		
		return ""+object.getCurrency()+"";
	}

	@Override
	public BankCurrency parse(String text, Locale locale) throws ParseException {
		System.out.println("Currency Parser");
		locale = new Locale("en", "US");
		 NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
		 int amount = Integer.parseInt(text);
		 String s = formatter.format(amount); 
		 System.out.println("Currency c = "+s);
		 BankCurrency bc = new BankCurrency();
		 bc.setCurrency(s);
		return bc;
	}

}
