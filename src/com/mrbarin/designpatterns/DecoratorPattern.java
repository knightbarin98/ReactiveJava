package com.mrbarin.designpatterns;

public class DecoratorPattern {

	public static void main(String[] args) {
		Burger myorder = new BurgerShop(burger -> burger.addCheese())
				.use(new BurgerShop(burger -> burger.addVegies()).use(new Burger("Queen")));
		System.out.println(myorder);
	}

}
