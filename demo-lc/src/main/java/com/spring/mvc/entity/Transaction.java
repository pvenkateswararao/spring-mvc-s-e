package com.spring.mvc.entity;

public class Transaction {
	Card card;
	BankCurrency bankCurrency;
	String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}
	public BankCurrency getBankCurrency() {
		return bankCurrency;
	}
	public void setBankCurrency(BankCurrency bankCurrency) {
		this.bankCurrency = bankCurrency;
	}
	
	
}
