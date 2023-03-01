package com.mrbarin.streams;

import java.util.stream.Stream;

public class ReduceOperation {
	public static void main(String[] args) {
		Stream.of(1,2,34,56,76,87,89,90)
		//Identity value for sum 0+1 = 1;
		//Identity value for mult 1*1 = 1;
		.reduce(0,(a,b)->a+b);
	}
}
