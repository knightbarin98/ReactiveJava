package predefinedfunctionalinterfaces;

import java.util.*;
import java.util.function.*;

public class BinaryOperatorFunctionPractice {

	public static void main(String[] args) {
		BinaryOperator<String> bioperator = (a,b) -> a+"."+b;
		String s = bioperator.apply("Samantha", "Horta");
		System.out.println(s);
	}

}
