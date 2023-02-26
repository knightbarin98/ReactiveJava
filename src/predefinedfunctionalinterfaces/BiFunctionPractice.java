package predefinedfunctionalinterfaces;

import java.util.*;
import java.util.function.*;

public class BiFunctionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String, String, Integer> bifun = (a,b) -> (a + b).length();
		Integer i  = bifun.apply("Basics", "Strong");
		System.out.println(i);
	}

}
