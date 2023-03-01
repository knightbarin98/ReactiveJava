package com.mrbarin.streams;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStreams {
	public static void main(String[] args) {
		
		Stream.iterate(0, i -> i -1);
		
		Stream.iterate(0,i -> i-1)
		.limit(15) //only 15 elements, not to number 15
		.forEach(System.out::println);
		
		//Hello infinite times
		Stream.generate(()-> "Hello")
		.forEach(System.out::println);
		
		Stream.generate(()-> new Random().nextInt() * 100)
		.forEach(System.out::println);
	}
}
