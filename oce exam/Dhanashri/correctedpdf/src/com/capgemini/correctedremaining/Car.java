package com.capgemini.correctedremaining;

public class Car extends Vehicle{

	int y;
	Car() {
		super(10);
		//this(20);
	}
	
	Car(int y) {
		super(y);
		this.y = y;
	}
	
	public String toString() {
		return super.x + " : " + this.y;
	}
}
