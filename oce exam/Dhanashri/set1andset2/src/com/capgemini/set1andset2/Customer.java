package com.capgemini.set1andset2;

public class Customer {

	ElectricAccount acct = new ElectricAccount();
	public void useElectricity( double kwh) {
		acct.addKwh(kwh);
	}
}
