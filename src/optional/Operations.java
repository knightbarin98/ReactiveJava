package optional;

import java.util.*;

public class Operations {
	public static void main(String[] args) {
		Optional<String> optional =  Optional.of("Value"); //Optional.empty();
		
		//map()
		//modfies the condition of the optional
		//if the optional is empty, map returns back an empty optional
		Optional<String> map = optional.map(val -> "Replaced");
		System.out.println(map.get());
		
		
		//filter()
		//checks the condition of the optional
		//takes predicate to check condition
		Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("Value"));
		System.out.println(filter.get());
		
		//flatMap()
		Optional<String> flatMap = optional.flatMap(val->Optional.of("Replaced By FlatMap"));
		System.out.println(flatMap.get());
		
	}
}
