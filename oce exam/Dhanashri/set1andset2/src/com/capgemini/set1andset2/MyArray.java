package com.capgemini.set1andset2;

import java.util.ArrayList;

public class MyArray {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String [] myArray;
		try {
			while(true) {
				myList.add("My STring");
			}
		} catch (RuntimeException e) {
			System.out.println("Caught an Runtime exception");
		}catch (Exception e) {
			System.out.println("Caught an exception");
		}
		
		System.out.println("Ready to use");
	}
}
