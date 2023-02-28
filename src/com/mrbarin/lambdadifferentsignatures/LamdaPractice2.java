package com.mrbarin.lambdadifferentsignatures;

public class LamdaPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperation add = (a,b) -> System.out.println(a+b);
		add.operation(10, 20);
		
		MathOperation multiply = (a,b) -> System.out.println(a*b);
		multiply.operation(10, 90);
	}

}
