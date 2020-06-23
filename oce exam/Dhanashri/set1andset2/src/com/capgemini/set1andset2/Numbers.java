package com.capgemini.set1andset2;

public class Numbers {

	public static void main(String[] args) {
		int nums [] = {1 , 2 , 3};
		int nums2 [] = {1 , 2, 3, 4, 5};
		
		nums2 = nums;
		for (int x : nums2) {
			System.out.println(x + " : ");
		}
	}
}
