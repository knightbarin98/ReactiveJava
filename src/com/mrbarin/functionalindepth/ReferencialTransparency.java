package com.mrbarin.functionalindepth;

public class ReferencialTransparency {
	public static void main(String[] args) {
		int result = add(2, multiply(2, multiply(2, 2)));
		System.out.println(result);
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) {
		System.out.println("Multiply a and b : " + a + "," + b);
		return a * b;
	}
}
