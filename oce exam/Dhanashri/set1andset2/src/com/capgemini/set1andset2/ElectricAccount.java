package com.capgemini.set1andset2;

public class ElectricAccount {

	private double kwh;
	private double rate = 0.07;
	private double bill;
	
	public void addKwh ( double kwh) {
		if (kwh > 0) {
			this.kwh += kwh;
			this.bill = this.kwh + this.rate;
		}
	}
	
}
