package com.mrbarin.streams;

public class Book {
	private String name;
	private String Author;
	private String genre;
	private Double rating;
	
	
	
	public Book(String name, String author, String genre, Double rating) {
		super();
		this.name = name;
		Author = author;
		this.genre = genre;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", Author=" + Author + ", genre=" + genre + ", rating=" + rating + "]";
	}
	
	
}
