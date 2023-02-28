package com.mrbarin.designpatterns;

public class Burger {
	private String burgerType;
	
	public Burger(String type) {
		this.burgerType = type;
	}
	
	public Burger addVegies() {
		System.out.println("Adding vegies to the burger");
		return new Burger(burgerType += " Vegie");
	}
	
	public Burger addCheese() {
		System.out.println("Adding cheese to the burger");
		return new Burger(burgerType += " Cheese");
	}

	@Override
	public String toString() {
		return String.format("%s", burgerType + " burger");
	}
	
	
}
