package optional;

import java.util.*;

public class MoreOperations {

	public static void main(String[] args) {
		// ifPresent
		// if there is value, the consumer method will be run
		Optional<String> optional = Optional.of("Value");
		optional.ifPresent(val -> System.out.println("This is a " + val));
		Optional.empty().ifPresent(val -> System.out.println("This is a " + val));

		// ifPresentOrElse
		// takes a consumer and a runnable
		// if optional has a value consumer will be run, if not the runnable will be
		// executed
		optional.ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));
		Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));

		// stream
		// if optional is not empty returns a sequential stream with only that value,
		// otherwise it return an empty string
		optional.stream().forEach(System.out::println);
		Optional.empty().stream().forEach(System.out::println);

		// or
		// takes a supplier,it only get executed if the optional is empty
		// NOTE: supplier should not return a null
		optional.or(() -> Optional.of("new value"));
		Optional.empty().or(() -> Optional.of("new value"));

		// equals
		// check other object equals to the optional or not
		// optional
		// either both are empty
		// or if the values in optionals are equal to each other via equals method
		optional.equals(Optional.of("Value"));

		// hashcode
		// if optional empty returns 0
		System.out.println(optional.hashCode());

	}

}
