package lambdadifferentsignatures;

public class LamdaPractice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LengthOfString len = str -> {
			int l = str.length();
			System.out.println("The length of the given string is " + l);
			return l;
		};
		
		int length = len.length("BasicStrongs");
		System.out.println(length);
		

	}

}
