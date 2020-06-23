package com.capgemini.correctedremaining;

public class TestAnimal {

	public static void main(String[] args) {
		WildAnimal wolf = new WildAnimal("Long");
		WildAnimal tiger = new WildAnimal("Feline" , 80 , "Short");
		
		System.out.println(wolf.type + " " + wolf.maxSpeed + " " + wolf.bound);
		System.out.println(tiger.type + " " + tiger.maxSpeed + " " + tiger.bound);

		
	}
}
