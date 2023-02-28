package com.mrbarin.functionalindepth;

public class FunctionalComposition {
	public static void main(String[] args) {
		MyFunction<Square,Integer> fun1 = s -> s.getArea();
		MyFunction<Integer, Double> fun2 = area -> Math.sqrt(area);
		
		MyFunction<Square, Double> getSide = fun2.compose(fun1);
		Square s = new Square();
		s.setArea(100);
		
		Double side  = getSide.apply(s);
		System.out.println(side);
	}
}
