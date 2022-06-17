
//Java Program To Delete The Repeated Elements In An Array

package corejava;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DeleteRepeatArray {
	
	
	//creating static variables
	public static Character[] k;

	public static void main(String args[]) throws Exception {

	//creating object of scanner class
	Scanner sc = new Scanner(System.in);
	char[] arr = new char[4];

	System.out.println("Array before deleting duplicates:");

	//input
	for (int i=0;i<arr.length;i++){

		arr[i]= sc.next().charAt(0);
		System.out.println("a["+i+"] = "+arr[i]);
	
	}
	//printing values
		System.out.println("\n Size: "+ arr.length);
		System.out.println("\n Array after deleting duplicates: ");
	
	//code to delete repeated value in array
	int size = deleteRepeats(arr);

	for(int i= 0 ;i< size;i++){
		System.out.println("a["+i+"] = "+k[i]);
	}
		System.out.println("\n Final Size: "+ k.length);
	}

	public static int deleteRepeats (char[] arr) {
		ArrayList<Character> lis= new ArrayList<Character>();

	for (int i=0;i<arr.length;i++) {
			if(lis.contains(arr[i])){
				continue;
			}
			else {
				lis.add(arr[i]);
			}
	}
    k =new Character[lis.size()];
    k=lis.toArray(k);

    return k.length;
	}
}