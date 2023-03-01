package com.mrbarin.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class BoundedSreams {
	public static void main(String[] args) {
		
//		1. stream of a collection
		List<Integer> list = List.of(1,4,7,9,4);
		Stream<Integer> sIntegers = list.stream();
		
//		Stream a map
		Map<Integer, String> map = Map.of(1,"one",2,"two",3,"three",4,"four");
		Stream<Entry<Integer, String>> sEntries = map.entrySet().stream();
		
		Stream<String> sValues = map.values().stream();
		Stream<Integer> sKeys = map.keySet().stream();
		
//		2. stream of()
		Stream<String> sStrings = Stream.of("Hey!","Happy","Thanksgiving");
		
//		3. stream of arrays
		Integer [] intArr = {3,5,7,9,11};
		Stream<Integer> stream = Arrays.stream(intArr);
		
		int [] intArr2 = {2,4,6,8,10};
		IntStream stream2 = Arrays.stream(intArr2);
		
//		4. stream using builder pattern
		Builder<Integer> builder = Stream.builder();
		builder.add(1).add(2).add(3);
//		code
//		condition
		builder.add(4);
		Stream<Integer> build = builder.build();
		
	}
}
