package com.capgemini.set1andset2;

public class EmployeeTest {

	public static void main(String[] args) {
		EMployee e = new EMployee();
		Manager m = new Manager();
		Director d = new Director();
		e.salary = 1_000;
		d.salary = 1_000;

		e.budget = 600;
		m.stockOptions = 200_000;
		m.budget = 700;
		d.stockOptions = 800;
	}
}
