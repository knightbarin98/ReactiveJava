package com.mrbarin.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntroduction {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		
		List<Book> popularHorrorBooks = new ArrayList<>();
		
		for(Book book: books) {
			if(book.getGenre().equals("Horror") && book.getRating() > 3) {
				popularHorrorBooks.add(book);
			}
		}
		
		//after java 8
		popularHorrorBooks = books
//				.parallelStream()
				.stream()
//				.parallel()
				.filter(book -> book.getGenre().equals("Horror"))
				.collect(Collectors.toList());
		
	}

}
