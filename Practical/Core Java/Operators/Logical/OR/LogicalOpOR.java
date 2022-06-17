package corejava;

public class LogicalOpOR {

	public static void main(String[] args) {
		//intialising variables
		int a=10, b=1, c=10, d=30;
		
		//a, b, c, d displaying
		System.out.println("Value of a: "+ a);
		System.out.println("Value of b: "+ b);
		System.out.println("Value of c: "+ c);
		System.out.println("Value of d: "+ d);
		
		//using logical OR to Verify Two constraints
		if( a>b || c==d ) 
			System.out.println("One or both" + " the conditions are true");
		else
			System.out.println("Both the" + " conditions are false");
	}
}