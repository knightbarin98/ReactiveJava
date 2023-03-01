package com.mrbarin.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StatelessStatefulOperations {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,4,5,6,7,9);
		
		//check documentation skip and limit are stateful
		//so how they are stateful is recommended to use parallel 
		List<Integer> collect = list
				.parallelStream()
				.skip(2)
				.limit(5)
				.collect(Collectors.toList());
	}
}
