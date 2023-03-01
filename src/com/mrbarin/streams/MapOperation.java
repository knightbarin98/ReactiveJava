package com.mrbarin.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperation {
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).map(e -> e * 25).collect(Collectors.toList())
				.forEach(System.out::println);

		List<Book> books = new ArrayList<>();

		books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.4082846298));
		books.add(new Book("The Notebooks", "Nicholas Sparks", "Romance", 4.10));
		books.add(new Book("Horror Cocktail", "Robert Blocj", "Horror", 2.67));
		books.add(new Book("House of leaves", "Mark Z. Danielewski", "Horror", 4.1082846298));

		//Avoid changing the state of an object
		List<String> popularHorrorBooksName = books.stream().filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
				.filter(book -> book.getRating() > 3)
				.map(book -> book.getName())
				.collect(Collectors.toList());
		
		popularHorrorBooksName.forEach(System.out::println);

		
	}
}
