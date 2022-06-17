package corejava;
import java.util.Scanner;

public class RelateOp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();
		
	System.out.println("num1 == num2 = " + (num1 == num2) );
		
	System.out.println("num1 != num2 = " + (num1 != num2) );
		
	System.out.println("num1 >  num2 = " + (num1 >  num2) );
		
	System.out.println("num1 <  num2 = " + (num1 <  num2) );
		
	System.out.println("num1 >= num2 = " + (num1 >= num2) );
		
	System.out.println("num1 <= num2 = " + (num1 <= num2) );		
	}
}
