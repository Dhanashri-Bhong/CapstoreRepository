package com.capgemini.correctedpdf;

public class Testw {
public static void main(String[] args) {
	int[][] arr1= new int[2][4];
	arr1[0]=new int[] {1,3,5,7};
	arr1[1]=new int[] {1,3};
	for(int[] a:arr1) {
		for(int i=0;i<arr1.length;i++) {
		System.out.println(a[i]);
	}
	}
}
}
