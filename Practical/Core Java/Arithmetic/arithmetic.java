// Program for taking input from user and performing arithmetic operations
package corejava;
// importing scanner class
import java.util.Scanner;

public class arithmetic {
	
	public static void main(String[] args) {
		
		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// Taking two inputs from user
		System.out.println("Enter First number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();
		
		//Perform Arithmetic Operations
		int add, sub, mul, div, mod;
		
		add = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
		
		// Print result
		   System.out.println("Addition of two numbers = " + add);
		   System.out.println("Subtraction of two numbers = " + sub);
		   System.out.println("Multiplication of two numbers = " + mul);
		   System.out.println("Division of two numbers = " + div);
		   System.out.println("Modulus of two numbers = " + mod);
		
	}

}