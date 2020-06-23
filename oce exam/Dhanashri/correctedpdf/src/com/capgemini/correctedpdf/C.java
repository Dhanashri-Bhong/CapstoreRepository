package com.capgemini.correctedpdf;

class A{
	public void test() {
		System.out.println("k");
	}
}
class B extends A{
public void test() {
	System.out.println("fghjkl");
}
}
public class C extends A {
public void test() {
	System.out.println("s");
}
public static void main(String[] args) {
	A a=new A();
	A ab=new C();
	a=(A)ab;
	A b3=(B)ab;
	A b3=(B)ab;
	a.test();
	b3.test();
}
}
