package corejava;
import java.util.Scanner;

public class LogicalANDORNOT {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter Third number : ");
		int c = sc.nextInt();
		
		System.out.println("Enter Fourth number : ");
		int d = sc.nextInt();
		
		System.out.println(" ");
		System.out.println("AND Operator");
		if((a<b) && (b==c)) {
			d=a+b+c;
			System.out.println("Sum is: " + d);
		}
		else {
			System.out.println("False Condition");
		
		}
		System.out.println(" ");
		
		System.out.println("OR Operator");
		if( a>b || c==d ) {
			System.out.println("One or both" + " the conditions are true");}
		else
			{
			System.out.println("Both the" + " conditions are false");
			
			}
			
		System.out.println(" ");
		System.out.println("NOT Operator");
		 	System.out.println("!(a < b) = " + !(a < b));
	        System.out.println("!(a > b) = " + !(a > b));
	        }
}
	        
