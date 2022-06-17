package corejava;

//Java Program to illustrate how to declare, instantiate, initialize  
//and traverse the Java array.  
class OneDimensional {  

public static void main(String args[]){  

	String a[]=new String[5];//declaration and instantiation  

		a[0]=" Rupesh";//initialization  

		a[1]=" Rushabh";  

		a[2]=" Tejas";  

		a[3]=" Suraj";  

		a[4]=" Vinayak";  

//traversing array  
for(int i=0;i<a.length;i++)//length is the property of array  
	System.out.println(a[i]);  
	}
}