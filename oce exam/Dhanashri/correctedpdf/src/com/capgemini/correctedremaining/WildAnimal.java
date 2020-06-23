package com.capgemini.correctedremaining;

public class WildAnimal extends Animal{

	String bound;
	
	WildAnimal (String bound) {
	super();
	this.bound = bound;
	}
	
	WildAnimal (String type , int maxSpeed , String bound) {
		
		super (type , maxSpeed);
		this.bound = bound;
	}
}
