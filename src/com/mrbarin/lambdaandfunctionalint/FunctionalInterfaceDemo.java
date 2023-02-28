package com.mrbarin.lambdaandfunctionalint;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyFunctionalInterface fun = ()->System.out.println("Hello");
//		fun.myMethod();
		
		onTheFLy(()->System.out.println("Hello"));
		
	}
	
	public static void onTheFLy(MyFunctionalInterface fun) {
		fun.myMethod();
	}

}
