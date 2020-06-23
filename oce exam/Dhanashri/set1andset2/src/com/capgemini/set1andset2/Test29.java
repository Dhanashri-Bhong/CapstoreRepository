package com.capgemini.set1andset2;

public class Test29 {
	public static void main(String[] args) {
		int num [] [] = new int [3] [1];
		for (int i =0 ; i < num.length; i++) {
			for (int j =0 ; j < num[i].length; j++) {
				num [i] [j] = 10;
				System.out.println( i + " " + j + "  "+num[i] [j]);
			}
		}
	}

}
