package corejava;

import java.util.*;

public class SingleDuser {

	public static void main(String[] args) {
		
		int len; //Length of Array
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Length: ");
		
		len = sc.nextInt();
		
		int a[]= new int[len];
		System.out.print("\nEnter: "+ len + " Elements To Store In Array\n");
		
		for (int i=0; i<len;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(" ");
		System.out.println("Elements In Array Are: \n");
		for (int i=0; i<len;i++) {
			System.out.print(a[i]+ " ");
		}
	}

}
