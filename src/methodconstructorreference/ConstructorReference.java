package methodconstructorreference;

import java.util.*;
import java.util.function.*;

public class ConstructorReference {

	public static void main(String[] args) {
		
//		Function<Runnable, Thread> threadGenerator = r -> new Thread(r);
		Function<Runnable, Thread> threadGenerator = Thread::new;
		
		Runnable task1 = () -> System.out.println("Task 1 executed");
		Runnable task2 = () -> System.out.println("Task 2 executed");
		
		Thread t1 = threadGenerator.apply(task1);
		Thread t2 = threadGenerator.apply(task2);
		
		t1.start();
		t2.start();
		
		threadGenerator.apply(()-> System.out.println("Task 3 executed")).start();
	}

}
