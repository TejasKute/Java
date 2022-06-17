
//Java Program To Iterate Through All Elements In A Array
package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class IterateArrayList {
  public static void main(String[] args){
	  
	  // Creating Variables
	 String a;
	  int b,c;
	  // Creating A Scanner Class Object
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		
		a = sc.next();
		
		System.out.print("Enter Age: ");
		
		b = sc.nextInt();
		
		System.out.print("Enter Student ID: ");
		
		c = sc.nextInt();

    
    ArrayList<String> Details = new ArrayList<>(); //Creating arraylist  

    
    Details.add(" "+ a);//Adding Object in arraylist From The User
    Details.add(" "+ b);
    Details.add(" "+ c);
    
    System.out.print("\n Array List: ");
    
  //Traversing list through Iterator
    Iterator itr=Details.iterator();  
	while(itr.hasNext()){  
		
		System.out.print(itr.next());  
	}  
 
  }
}