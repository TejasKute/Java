package corejava;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
	


	int num, sum;
	sum = 0;
	num = 0;
	
	do
	{
		// sum += num ;
		sum=sum + num;
		System.out.println("Enter a number : ");
		num = sc.nextInt();
	}
	while(num>=0);
	
	System.out.println("The sum of numbers are: " + sum);
	
	sc.close();
}
}