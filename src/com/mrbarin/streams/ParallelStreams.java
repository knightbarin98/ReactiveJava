package com.mrbarin.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreams {
	public static void main(String[] args) {
		long startTime;
		long endTime;
		List<Employee> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(new Employee("John",20000.00));
			list.add(new Employee("Rohn",3000.00));
			list.add(new Employee("Tom",15000.00));
			list.add(new Employee("Bheem",8000.00));
			list.add(new Employee("Shiva",200.00));
			list.add(new Employee("Krishna",50000.00));
		}
		
		startTime = System.currentTimeMillis();
		System.out.println("Performing sequentially " +
		list.stream()
		.filter(e -> e.getPayment() > 1000)
		.count());
		endTime = System.currentTimeMillis();
		
		System.out.println("Time take with sequentially : " + (endTime - startTime));
		
		startTime = System.currentTimeMillis();
		System.out.println("Performing parallely " +
		list.stream()
		.parallel()
		.filter(e -> e.getPayment() > 1000)
		.count());
		endTime = System.currentTimeMillis();
		
		System.out.println("Time take with parallely : " + (endTime - startTime));
	}
}
