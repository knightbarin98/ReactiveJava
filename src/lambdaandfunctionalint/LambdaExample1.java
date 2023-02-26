package lambdaandfunctionalint;

public class LambdaExample1 {

	public static void main(String[] args) {
		
		//Before java 8 if we want to create an implementation on the fly, we used anonymous inner class
		///MyRunnable runnable = new MyRunnable();
		/*
		 * Thread t = new Thread(new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * System.out.println("Thread Executed!"); }
		 * 
		 * });
		 */
		
//		With lamda
//		We can only convert interfaces into lambda if only they have a function
		Thread t = new Thread(()->System.out.println("Thread executed"));
		t.start();
	}

}
