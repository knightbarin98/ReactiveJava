package lambdaandfunctionalint;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imperative
		int sumOfEvens = 0;
		for(int i =0; i<=100; i++) {
			if(i % 2 == 0) {
				sumOfEvens += i;
			}
		}
		System.out.println(sumOfEvens);
		
		//Declarative
		sumOfEvens = IntStream.rangeClosed(0, 100)
		.filter(i  -> i % 2 == 0)
		.reduce((x,y)-> x+y)
		.getAsInt();
		
		System.out.println(sumOfEvens);
	}

}
