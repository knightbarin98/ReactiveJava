package com.mrbarin.streams;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculations {

	public static void main(String[] args) {
//		IntStream
//		DoubleStream
//		LongStream
		
//		Sum
		int sum = IntStream.of(1,2,4).sum();
		
//		max() optional: primitive
		OptionalInt maxOptional = IntStream.of(1,2,3,4).max();
		System.out.println(maxOptional.getAsInt());
		
//		min() Optional primitive
		OptionalInt minOptional = IntStream.of(1,2,3,4).min();
		System.out.println(minOptional.getAsInt());
		
//		average Double optional
		OptionalDouble avg = IntStream.of(1,2,3,4).average();
		System.out.println(avg.getAsDouble());
		
//		summaryStatistics
		IntSummaryStatistics statistics = IntStream.of(1,2,34)
				.summaryStatistics();
		System.out.println(statistics);
	}

}
