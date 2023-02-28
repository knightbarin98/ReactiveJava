package com.mrbarin.designpatterns;

public class FluentInterfacesShopping {
	public static void main(String[] args) {
		Order myOrder = new Order();
//		myOrder.add("shoes");
//		myOrder.add("headhphones");
//		myOrder.deliverAt("Main Street 43");
//		myOrder.place();
		myOrder.add("shoes").add("headphones").deliverAt("Main Street 45");

		Order.place(order -> order.add("shoes").add("headphones").deliverAt("Main Street"));
	}
}
