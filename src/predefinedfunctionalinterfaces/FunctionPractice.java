package predefinedfunctionalinterfaces;

import java.util.*;
import java.util.function.*;

public class FunctionPractice {

	public static void main(String[] args) {

		List<String> list = List.of("Kit", "Kat", "Shake");

		Function<String, Integer> function = e -> e.length();

		List<Integer> lengths = map(list, function);
		System.out.println(lengths);
	}

	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> elements = new ArrayList<>();

		for (T t : list) {
			elements.add(function.apply(t));
		}

		return elements;
	}

}
