package com.capgemini.set1andset2;

public class ThreeHundred {

	public static int stVar = 100;
	public int var = 200;
	public String toString() {
		return stVar + " : " + var;
	}
	
	public static void main(String[] args) {
		ThreeHundred t1 = new ThreeHundred();
		t1.var = 300;
		System.out.println(t1);
		ThreeHundred t2 = new ThreeHundred();
		t2.stVar = 300;
		System.out.println(t2);
	}
}
