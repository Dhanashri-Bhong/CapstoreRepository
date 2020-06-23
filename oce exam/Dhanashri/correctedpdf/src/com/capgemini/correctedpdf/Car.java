package com.capgemini.correctedpdf;

public class Car extends Vehicle {
	
	String trans;
	
	Car (String trans) {
		this.trans = trans;
	}

	Car(String type, int maxSpeed , String trans) {
		super(type, maxSpeed);
		this(trans);
	}

	
	
}
