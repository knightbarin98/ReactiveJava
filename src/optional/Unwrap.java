package optional;

import java.util.Optional;

public class Unwrap {

	public static void main(String[] args) {
		Integer a = 10;
		Optional<Integer> optional = Optional.of(a);
		
		//get
		Integer val = optional.get();
		System.out.println(val);
		
//		Erro no such element exception
		Optional<Integer> emptyOptional = Optional.empty();
//		emptyOptional.get();
		
		//isPresent
		Integer val1 = optional.isPresent() ? optional.get() : 0;
		System.out.println(val1);
		
		//orElse, orElseGet
		Integer val2 = optional.orElse(0);
		System.out.println(val2);
		
		//orElseGet use a supplier
		Integer val3 = emptyOptional.orElseGet(()->0);
		System.out.println(val3);
		
		//orElseThrow, takes an exception supplier
		Integer throwint = emptyOptional.orElseThrow(()->new IllegalArgumentException());
		
		//orElseThrow() == get()
		//more transparently
	}

}
