package com.capgemini.set1andset2;

public class Test2 {

	int x , y;
	public Test2( int x , int y) {
		initialize(x , y);
	}
	
	public void initialize ( int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
		int x = 9 , y = 5;
		Test2 obj = new Test2(x , y);
		System.out.println(x + " " + y);
	}
}
