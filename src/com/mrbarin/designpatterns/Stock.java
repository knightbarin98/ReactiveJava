package com.mrbarin.designpatterns;

public class Stock {
	private String name;
	private Double price;
	private Double units;
	
	
	public Stock(String name, Double price, Double second) {
		super();
		this.name = name;
		this.price = price;
		this.units = second;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getUnits() {
		return units;
	}
	public void setUnits(Double second) {
		this.units = second;
	}

	@Override
	public String toString() {
		return "Stock [name=" + name + ", price=" + price + ", units=" + units + "]";
	}
	
	
	
}
