package com.mrbarin.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class SettingParallelism {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "2");
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
		
		ForkJoinPool pool = new ForkJoinPool(2);
		
		List<Employee> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add(new Employee("John",20000.00));
			list.add(new Employee("Rohn",3000.00));
			list.add(new Employee("Tom",15000.00));
			list.add(new Employee("Bheem",8000.00));
			list.add(new Employee("Shiva",200.00));
			list.add(new Employee("Krishna",50000.00));
		}
		
		try {
			Long long1 = pool.submit(()->
			list.parallelStream()
			.filter(e -> e.getPayment() > 1000.00)
			.count()
					).get();
			System.out.println(long1);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Computational intensive
		//number of threads <= number of cores
		//IO intensive
		//Then number of threads could be > number of cores
	}
}
