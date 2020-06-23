package com.capgemini.set1andset2;

public class Test4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		
		if ( sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		} else if (sb.equals(s)) {
			System.out.println("Match 1");
		} else {
			System.out.println("No match");
		}
	}
}
