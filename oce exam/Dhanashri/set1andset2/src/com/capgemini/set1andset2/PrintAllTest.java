package com.capgemini.set1andset2;

public class PrintAllTest {

	public static void main(String[] args) {
		String names [] = { "Thomas" , "Peter" , "Joseph"};
		String pwd[] = new String[3];
		int idx = 0;
		try {
			for (String n : names) {
				pwd [idx] = n.substring(2, 6);
				System.out.println(pwd[idx]);
				idx++;
			}
		} catch (RuntimeException e) {

			System.out.println("Invalid Names");
		}
	}
}
