package com.capgemini.set1andset2;

public class Equals {

	public static void main(String[] args) {
		String str1 = "Java";
		String [] str2 = {"J" , "a" , "v" , "a"};
		String str3 = "";
		for (String str : str2) {
			str3 = str3 + str;
		}
		
		boolean b1 = (str1.equals(str3));
		boolean b2 = (str1 == str3);
		System.out.println(b1 + " " + b2);
		
		String [] strs = {"A" , "B"};
		int idx = 0;
		for (String s :strs) {
			strs[idx].concat("element" + idx);
			idx++;
		}
		for(idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
		
		String str5 = " ";
		str5.trim();
		System.out.println(str5.equals("") + "  " + str5.isEmpty());
		
	}
}
