package com.capgemini.correctedremaining;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee("Joe" , 50);
		Employee e3 = new Employee("Dhanashri" , 79 ,60000);

		e1.printDetails();
		e2.printDetails();
		e3.printDetails();

	}
}
