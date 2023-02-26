package lambdaandfunctionalint;

public class LamdaUnderTheHood {

	public static void main(String[] args) {
//		With inner classes there are created .java file that corresponds to these classes, making the jar or war more bulky
		/*
		 * MyFunctionalInterface fun1 = new MyFunctionalInterface() {
		 * 
		 * @Override public void myMethod() { System.out.println("Implementation 1"); }
		 * 
		 * };
		 * 
		 * MyFunctionalInterface fun2 = new MyFunctionalInterface() {
		 * 
		 * @Override public void myMethod() { System.out.println("Implementation 2"); }
		 * 
		 * };
		 */
		
		//With lambda
		MyFunctionalInterface fun = ()->System.out.println("I am light weight");
	}

}
