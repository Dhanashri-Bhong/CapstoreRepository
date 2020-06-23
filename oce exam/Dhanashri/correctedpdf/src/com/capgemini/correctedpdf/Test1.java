package com.capgemini.correctedpdf;

public class Test1 {
public static void main(String[] args) {
	String names[]= {"thomas","peter","joseph"};
	String pwd[]=new String[3];
	int idx=0;
	try {
		for(String n:names) {
			pwd[idx]=n.substring(2,6);
			idx++;		
			}
	}catch (Exception e) {
		System.out.println("invalid");
	}
	for(String p:pwd) {
		System.out.println(p);
	}
	
}
}
