package com.capgemini.correctedpdf;

public class CheckingTest {

	public static void main(String[] args) {
		CheckingAccount acct = new CheckingAccount((int)(Math.random()* 1000));
		
		//acct.amount = 0;
		acct.changeAmount(-acct.getAmount());
		System.out.println(acct.getAmount());
		
	}
}
