package com.mrbarin.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.4082846298));
		books.add(new Book("The Notebooks", "Nicholas Sparks", "Romance", 4.10));
		books.add(new Book("Horror Cocktail", "Robert Blocj", "Horror", 2.67));
		books.add(new Book("House of leaves", "Mark Z. Danielewski", "Horror", 4.1082846298));
		
//		map returns a stream of Objects
//		mapToDouble returns a stream of primitive double
		OptionalDouble average = books.stream()
			.mapToDouble(book -> book.getRating())
			.average();
		
		System.out.println(average.getAsDouble());
		
		IntStream intS = IntStream.of(1,3,5,7);
		DoubleStream doubleS = DoubleStream.of(1,3,5,7);
		LongStream longS = LongStream.of(1,3,5,7);
		
		//return object version of the stream
		Stream<Integer> boxed = intS.boxed();
		doubleS.mapToObj(val -> val);

	}

}
