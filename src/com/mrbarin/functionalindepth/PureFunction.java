package com.mrbarin.functionalindepth;

public class PureFunction {
	
	public static void main(String[] args) {
		int result = sum(multiply(2,3),multiply(3,4));
		System.out.println(result);
	}

//	Not side effects, not modify the values in the parameters
	public static int sum(int a, int b) {
		return a + b;
	}

	public static int multiply(int a, int b) {
		log(String.format("Returning %s as the result of %s * %s", a * b, a, b));
		return a * b;
	}
	
	public static void log(String m) {
		System.out.println(m);
	}

}

class ImpureFunction {
	private int value = 0;

//	Side effect, modify a class field
	public int add(int nextValue) {
		this.value += nextValue;
		return this.value;
	}
}
