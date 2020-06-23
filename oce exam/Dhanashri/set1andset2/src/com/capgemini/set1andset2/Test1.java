package com.capgemini.set1andset2;

public class Test1 {

	public static void main(String[] args) {
		Test1 ts = new Test1();
		System.out.println(isAvailable + " ");
		isAvailable = ts.doStuff();
		System.out.println(isAvailable);
		
		int x = 5;
		while (isAvailable(x)) {
			System.out.println(x--);
		}
	}
	
	public static boolean isAvailable (int x) {
		return x-- > 0 ? true : false;
	}
	
	public static boolean doStuff() {
		return !isAvailable;
	}
	
	static boolean isAvailable = false;
}
