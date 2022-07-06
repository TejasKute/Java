package com.bankingsystem.service;

public class FixedDeposite {

	public static final double interestRate = 7.60;// global constant

	public static void fixedDeposit(int year, int amnt) {
		double totalInterest, amount;
		totalInterest = (amnt * interestRate * year) / 100;
		amount = amnt + totalInterest;
		System.out.println("After " + year + " years,you will receive " + amount + "/ only");
	}
}
