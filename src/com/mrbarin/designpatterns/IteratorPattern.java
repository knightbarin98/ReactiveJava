package com.mrbarin.designpatterns;

public class IteratorPattern {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(new Object[] {1,3,5,467,8});
		list.forEach(System.out::println);
	}

}
