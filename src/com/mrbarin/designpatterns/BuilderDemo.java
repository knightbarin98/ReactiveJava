package com.mrbarin.designpatterns;

public class BuilderDemo {
	public static void main(String[] args) {
		MobileBuilder builder = new MobileBuilder();
		builder.with(myBuilder ->{
			myBuilder.ram = 4;
			myBuilder.battery = 4000;
			myBuilder.processor = "A12 Bionic";
		});
		Mobile mobile = builder.createMobile();
		System.out.println(mobile);
	}
}
