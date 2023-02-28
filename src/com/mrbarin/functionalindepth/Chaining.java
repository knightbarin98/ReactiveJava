package com.mrbarin.functionalindepth;

import java.util.function.*;

public class Chaining {

	public static void main(String[] args) {
		MyConsumer<String> c1 = s -> System.out.println(s);
		MyConsumer<String> c2 = s -> System.out.println(s);
		
//		c1.accept("Hello");
//		c2.accept("Hello");
		
		MyConsumer<String> c3 = s -> {
			c1.accept(s);
			c2.accept(s);
		};
		c3.accept("Hello");
		
		MyConsumer<String> c4 = c1.thenAccept(c2);
		c4.accept("BasicsStrong");
		
		Function<Integer, Integer> f1 = s -> s+2;
		Function<Integer, Integer> f2 = s -> s*2;
		Function<Integer, Integer> f3 = f1.andThen(f2);
		
		System.out.println(f3.apply(10));
	}

}
