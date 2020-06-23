package com.capgemini.correctedpdf;

public class ProductTest {

	public void updatePrice(Product product , double price) {
		price = price*2;
		product.price = product.price + price;
	}
	
	public static void main(String[] args) {
		Product prt = new Product();
		prt.price = 200;
		double newPrice = 100;
		
		ProductTest t = new ProductTest();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + "  " + newPrice);
		/*
		 * Integer s1; short s2; String s = (String) (s1 * s2);
		 */
	}
}
