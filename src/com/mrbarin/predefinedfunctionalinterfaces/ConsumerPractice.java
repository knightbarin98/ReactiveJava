package com.mrbarin.predefinedfunctionalinterfaces;

import java.util.*;
import java.util.function.*;

public class ConsumerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(34,67,8,23,67,89,90);
		
		
		//be any operation that takes something, does something with it, but returns nothing
		Consumer<Integer> consumer = e -> System.out.println(e);
		consumer.accept(56);
		
		printElements(list, consumer);
	}
	
	private static <T> void printElements(List<T> list, Consumer<T> consumer) {
		for(T t: list) {
			consumer.accept(t);
		}
	}

}
