
// Java Program To Print Right Angle Star Triangle Pattern
package corejava;

import java.util.*;

public class PrintStar   
	{   
		public static void main(String args[])   
		{ 
			int i, j;//i for rows and j for columns      
			
			int Row;//row denotes the number of rows you want to print  
			
			System.out.print("Enter A Number Of Rows: ");   
			
			// Creating A Scanner Class Object
			Scanner sc = new Scanner(System.in); 
			
			Row = sc.nextInt();
			System.out.println();
			
				for(i=0; i<Row; i++)   //outer loop for rows  
					{   
						for(j=0; j<=i; j++)   //inner loop for columns  
							{   
								System.out.print("* ");   //prints stars   
							}   
								System.out.println();   //throws the cursor in a new line after printing each line  
					}   
		}   
	}  