
// Java Program To Calculate The Sum Of 10 Natural Numbers
package corejava;

import java.util.*;
public class SumNum  
	{  
	public static void main(String[] args)   
		{  
		
			int i, num;
			
			// Creating A Scanner Class Object
			Scanner sc = new Scanner(System.in); 
			
			System.out.print("Enter Number Count = ");  
			num = sc.nextInt();
			
			int sum = 0;  

			for(i = 1; i <= num; ++i)  //executes until the condition returns true  
				{  

					sum = sum + i;  //adding the value of i into sum variable  
				}  
 
			System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
		}  
	}  