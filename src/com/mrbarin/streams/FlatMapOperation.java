package com.mrbarin.streams;

import java.util.stream.Stream;

public class FlatMapOperation {
	public static void main(String[] args) {
		Stream<String> a = Stream.of("Hello ", "there! ");
		Stream<String> b = Stream.of("Learning", "Java? ");
		
		Stream<Stream<String>> streamOf = Stream.of(a,b);
		
		Stream<String> flat = streamOf.flatMap(e -> e);
		flat.forEach(System.out::println);
	}
}
