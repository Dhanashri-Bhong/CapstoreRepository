package com.capgemini.set1andset2;

public class App {
public static void main(String[] args) {
	int x=6;
	while(isavaliable(x)) {
		System.out.println(--x);
		
	}
}
	public static boolean isavaliable(int x) {
		return --x>0?true:false;
}
}
