package com.mrbarin.predefinedfunctionalinterfaces;

import java.util.*;
import java.util.function.*;

public class UnaryOperatorPractice {

	public static void main(String[] args) {
		List<Integer> list = List.of(10,20,30,40,50);
		
		UnaryOperator<Integer> operator = i -> i * 100;
		
		List<Integer> newList = mapper(list, operator);
		System.out.println(newList);

	}
	
	private static <T> List<T> mapper(List<T> list, UnaryOperator<T> operator){
		List<T> elements = new ArrayList<>();
		for(T t: list) {
			elements.add(operator.apply(t));
		}
		
		return elements;
	}

}
