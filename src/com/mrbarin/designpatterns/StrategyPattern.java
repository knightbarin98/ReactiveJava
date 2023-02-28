package com.mrbarin.designpatterns;

import java.util.*;
import java.util.function.*;

public class StrategyPattern {

	public static void main(String[] args) {
		List<Stock> stockList = new ArrayList<>();
		stockList.add(new Stock("AAPL", 318.65, 10.0));
		stockList.add(new Stock("MSFT", 166.65, 45.0));
		stockList.add(new Stock("GOOGL", 99.65, 12.5));
		stockList.add(new Stock("AMZ", 2355.65, 41.0));
		stockList.add(new Stock("GOOGL", 123.65, 89.5));
		stockList.add(new Stock("AAPL", 5528.65, 15.3));
		stockList.add(new Stock("AMZ", 1353.65, 10.9));

//		StockFilters.bySymbol(stockList, "AMZ").forEach(System.out::println);
//		
//		StockFilters.byPriceAbove(stockList, 300.00).forEach(System.out::println);

		StockFilters.filter(stockList, stock -> stock.getName().equals("AMZ")).forEach(System.out::println);
		StockFilters.filter(stockList, stock -> stock.getPrice() > 300.00).forEach(System.out::println);

	}

}
