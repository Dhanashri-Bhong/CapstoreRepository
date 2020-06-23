package com.capgemini.questions;

public class One {
public static void main(String[] args) {
	int date[]= {2011,2012,2013,2014};
	int key=2014;
	int count=0;
	for(int e:date) {
		if(e!=key) {
			count++;
		continue;
			
	}
}
System.out.print(count+"found");
}
}
