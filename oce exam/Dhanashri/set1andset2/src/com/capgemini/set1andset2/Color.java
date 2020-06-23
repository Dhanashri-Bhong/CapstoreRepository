package com.capgemini.set1andset2;

import java.util.ArrayList;
import java.util.List;

public class Color {

	public static void main(String[] args) {
		List color = new ArrayList();
		color.add("green");
		color.add("blue");
		color.add("red");
		color.add("yellow");
		color.remove(2);
		color.add(3, "cyan");
		System.out.println(color);

	}
}
