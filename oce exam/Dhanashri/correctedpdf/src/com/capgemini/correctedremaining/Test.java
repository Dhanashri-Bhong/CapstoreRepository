package com.capgemini.correctedremaining;

public class Test {

	static int count = 0;
	int i = 0;
	public void changeCount() {
		while(i < 5) {
			i++;
			count++;
		}
	}
	
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
          
		t1.changeCount();
		t2.changeCount();
		System.out.println(t1.count + " : " + t2.count);
		
	}
}
