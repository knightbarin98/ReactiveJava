package com.mrbarin.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleUseStreamsNotContainers {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		
		books.add(new Book("The Alchemist", "Paulo Coelho", "Adventure", 4.4082846298));
		books.add(new Book("The Notebooks", "Nicholas Sparks", "Romance", 4.10));
		books.add(new Book("Horror Cocktail", "Robert Blocj", "Horror", 2.67));
		books.add(new Book("House of leaves", "Mark Z. Danielewski", "Horror", 4.1082846298));
		
		//Once you operated on a stream it becomes empty, inmutable, can only be used once
		Stream<Book> stream = books.stream();

		List<Book> popularHorrorBooks = books.stream() 
				.filter(book -> book.getGenre().equalsIgnoreCase("Horror")) 
				.filter(book -> book.getRating() > 3) 
				.collect(Collectors.toList());
		
		List<Book> popularRomanceBooks = books.stream() 
				.filter(book -> book.getGenre().equalsIgnoreCase("Romance")) 
				.filter(book -> book.getRating() > 3) 
				.collect(Collectors.toList());
		
		popularHorrorBooks.forEach(System.out::println);
		popularRomanceBooks.forEach(System.out::println);
	}

}
