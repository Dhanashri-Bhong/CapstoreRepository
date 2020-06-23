package com.capgemini.correctedremaining;

public class MyExceptionTest {

	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException ns) {
			System.out.println("A");
		}
		
		
	}

	public static void method1() {

		try {
			throw Math.random() > 0.5 ? new MyException () : new RuntimeException();
		} catch (RuntimeException e) {
          System.out.println("B");
		}
	}

	
}
