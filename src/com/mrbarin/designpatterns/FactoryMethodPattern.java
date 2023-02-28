package com.mrbarin.designpatterns;

public class FactoryMethodPattern {
	public static void main(String[] args) {
		Flooring flooring = FlooringFactory.getFlooring(-1, 18);
		flooring.installation();
	}
}
