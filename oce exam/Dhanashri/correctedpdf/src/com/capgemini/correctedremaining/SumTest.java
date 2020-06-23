package com.capgemini.correctedremaining;

public class SumTest {

	public static void doSum( Integer x , Integer y) {
		System.out.println("Integer Sum is : " + (x + y));
	}
	
	public static void doSum( double x , double y) {
		System.out.println("double Sum is : " + (x + y));
	}
	
	public static void doSum( float x , float y) {
		System.out.println("float Sum is : " + (x + y));
	}
	
	public static void doSum( int x , int y) {
		System.out.println("int Sum is : " + (x + y));
	}
	
	public static void main(String[] args) {
		doSum(10 , 20);
		doSum(10.0 , 20.0);

	}
	
}
