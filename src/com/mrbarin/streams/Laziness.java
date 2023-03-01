package com.mrbarin.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Laziness {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.4082846298));
		books.add(new Book("The Notebooks", "Nicholas Sparks", "Romance", 4.10));
		books.add(new Book("Horror Cocktail", "Robert Blocj", "Horror", 2.67));
		books.add(new Book("House of leaves", "Mark Z. Danielewski", "Horror", 4.1082846298));

		
		Stream<Book> stream = books.stream()
				.filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
				.peek(book->System.out.println("Filtered Book " + book))
				.filter(book -> book.getRating() > 3);
		
		System.out.println("Filtering done!");
		
		collect(stream);
	}
	
	private static void collect(Stream<Book> stream) {
		List<Book> popularHorrorBooks = stream.collect(Collectors.toList());
		System.out.println("Collection DOne");
		popularHorrorBooks.forEach(System.out::println);
	}

}
