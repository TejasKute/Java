
package corejava;

//Java program to demonstrate working of
//interface
import java.io.*;

//A simple interface
interface Bank{  
	
	float rateOfInterest();  
	
	}  
	
//A class that implements the interface.
class SBI implements Bank{  
	
		public float rateOfInterest(){return 9.15f;}  
	
		}  
	
class PNB implements Bank{  
	
		public float rateOfInterest(){return 9.7f;}  
	
}  
//Main class
class TestInterface2{  
	
	public static void main(String[] args){  
	
		Bank b=new SBI();  
	
		System.out.println("ROI: "+b.rateOfInterest());  
	
		}
	}  