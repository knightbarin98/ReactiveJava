package optional;

import java.util.*;

public class OptionalCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String val = "A string";
		Optional<String> optional = Optional.of(val);
		
		//empty
		Optional<Integer> empty = Optional.empty();
		
		//nullable
		Optional<String> nullable = Optional.ofNullable(val);
		Optional<String> emptynullable = Optional.ofNullable(null);
	}

}
