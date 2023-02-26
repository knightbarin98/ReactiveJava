package methodconstructorreference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = List.of(34,67,8,23,67,89,90);
		
//		Example of method reference object::instanceMethod
//		Consumer<Integer> consumer = e -> System.out.println(e);
		Consumer<Integer> consumer = System.out::println;
		consumer.accept(56);
		
		printElements(list1, consumer);
		
//		Example of method reference Class::staticMethod
//		Supplier<Double> randomNumber = () -> Math.random();
		Supplier<Double> randomNumber = Math::random;
		System.out.println(randomNumber.get());
		
		List<String> list2 = List.of("Kit", "Kat", "Shake");
		
//		Example of method reference Class::instanceMethod
//		Function<String, Integer> function = e -> e.length();
		Function<String, Integer> function = String::length; 

		List<Integer> lengths = map(list2, function);
		System.out.println(lengths);
	}
	
	private static <T> void printElements(List<T> list, Consumer<T> consumer) {
		for(T t: list) {
			consumer.accept(t);
		}
	}
	
	private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> elements = new ArrayList<>();

		for (T t : list) {
			elements.add(function.apply(t));
		}

		return elements;
	}

}
