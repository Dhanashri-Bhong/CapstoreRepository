package com.capgemini.set1andset2;

public class Vowel {

	private char var;
	public static void main(String[] args) {
		char var1 = 'a';
		char var2 = var1;
		var2 = 'e';
		
		Vowel v = new Vowel();
		Vowel v1 = v;
		v.var= 'i';
		v1.var = 'o';
		System.out.println(var1 + " , " + var2);
		System.out.println(v.var + " , " + v1.var);
	}
}
