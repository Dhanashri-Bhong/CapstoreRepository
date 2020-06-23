package com.capgemini.correctedpdf;

public class ElectricAccount {

	private double kwh;
	private double rate = 0.07;
	private double bill;
	
	public void addKwh(double kwh) {
		this.kwh = kwh;
		this.bill = this.kwh * this.rate;
	}
}
