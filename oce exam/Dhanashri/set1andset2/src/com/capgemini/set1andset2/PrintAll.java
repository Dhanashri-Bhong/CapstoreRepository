package com.capgemini.set1andset2;

public class PrintAll {

	Character c;
	boolean b;
	float f;
	void printAll() {
		System.out.println("c = " +c);
		System.out.println("b = " +b);
		System.out.println("f = " +f);

	}
	public static void main(String[] args) {
		PrintAll f = new PrintAll();
		f.printAll();
	}
}
