package com.capgemini.correctedpdf;

class C2{
	public void displayC2() {
		System.out.println("sdfghj");
	}
}
interface  I{
	public void displayI();
}
 class C1 extends C2 implements I{


	public void displayI() {
	System.out.println("c1");
		
	}
	public static void main(String[] args) {
		C2 obj=new C1();
		I obj1=new C1();
		C2 s=obj1;
		I w=obj;
		w.displayI();
		s.displayC2();
	}
	 
 }
 