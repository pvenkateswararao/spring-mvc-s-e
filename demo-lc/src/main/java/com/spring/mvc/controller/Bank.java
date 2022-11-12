package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc.entity.Transaction;

@Controller()
@RequestMapping("/bank")
public class Bank {

	@RequestMapping("/showForm")
	public String showForm(@ModelAttribute Transaction transaction) {
		return "show-bank-form";
	}
	@RequestMapping("/showDetails")
	public String transactionDetails(@ModelAttribute Transaction transaction) {
		System.out.println("Name : "+transaction.getName());
		System.out.println("Card N1: "+transaction.getCard().getFirstNumber());
		System.out.println("Card N2: "+transaction.getCard().getSecondNumber());
		System.out.println("Currency : "+transaction.getBankCurrency().getCurrency());
		return "show-bank-transaction-details";
	}
}
