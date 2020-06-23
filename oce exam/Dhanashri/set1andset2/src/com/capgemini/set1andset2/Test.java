package com.capgemini.set1andset2;

public class Test {

	public static void main(String[] args) {
		int wd = 0;
		String days[] = { "Sun" , "Mon" , "Wed" , "Sat"};
		for (String s: days) {
			switch(s) {
			case "Sat" :
			case "Sun" :
				wd -= 1;
				break;
			case "Mon" :
				wd -= 1;
				break;
			case "Wed" :
				wd += 2;
			}
		}
		System.out.println(wd);
	}
}
