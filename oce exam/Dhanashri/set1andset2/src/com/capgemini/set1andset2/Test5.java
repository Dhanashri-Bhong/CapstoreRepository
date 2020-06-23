package com.capgemini.set1andset2;

public class Test5 {

	public static void main(String[] args) {
		String ta = "A";
		ta = ta.concat("B ");
		String tb = " C ";
		ta = ta.concat(tb);
		ta.replace("B", "C");
		ta = ta.concat("D");
		System.out.println(ta);
	}
}
