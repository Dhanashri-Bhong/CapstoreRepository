package com.capgemini.correctedpdf;

public class Planet2 {
public String name;
public int  moon;
public Planet2(String name,int moon) {
	this.name=name;
	this.moon=moon;
}
public static void main(String[] args) {
	Planet2[] planet= {new Planet2("mercury",0),new Planet2("venus",0),new Planet2("earth",1),
			new Planet2("mars",2)};
			
	System.out.println(planet);
	System.out.println(planet[2]);
	System.out.println(planet[2].moon);
}
}
