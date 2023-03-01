package com.mrbarin.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeline {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		// Stream pipeline
		List<Book> popularHorrorBooks = books.stream() // source
				.filter(book -> book.getGenre().equals("Horror")) // intermediate op
				.filter(book -> book.getRating() > 3) // intermediate op
				.collect(Collectors.toList()); // terminal op

//		1.
		Stream<Book> stream = books.stream(); // source
//		2. Intermediate operation
		Stream<Book> streamHorrorBooks = stream.filter(book -> book.getGenre().equals("Horror"));
//		3. intermediate operation
		Stream<Book> pHorrorBooks = streamHorrorBooks.filter(book -> book.getRating() > 3);
//		4.terminal operation
		List<Book> topHorrorBooks = pHorrorBooks.collect(Collectors.toList());

	}

}
