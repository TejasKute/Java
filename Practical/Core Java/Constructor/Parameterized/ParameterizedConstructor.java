package corejava;

public class ParameterizedConstructor {

	//Default constructor
	ParameterizedConstructor(){
	      System.out.println("Default constructor");
	   }
	   /* Parameterized constructor with 
	    * two integer arguments
	    */
	ParameterizedConstructor(int i, int j){
	      System.out.println("constructor with Two parameters");
	   }
	   /* Parameterized constructor with 
	    * three integer arguments
	    */
	ParameterizedConstructor(int i, int j, int k){
	      System.out.println("constructor with Three parameters");	      
	   }
		   
	   /* Parameterized constructor with 
	    * two arguments, int and String
	    */
	ParameterizedConstructor(int i, String name){
	      System.out.println("constructor with int and String parameter");
	   }
	   public static void main(String args[]){
	      //This will invoke default constructor
		   ParameterizedConstructor obj = new ParameterizedConstructor();
	      /* This will invoke the constructor 
	       * with two int parameters
	       */
		   ParameterizedConstructor obj2 = new ParameterizedConstructor(12, 12);
	      /* This will invoke the constructor 
	       * with three int parameters
	       */
		   ParameterizedConstructor obj3 = new ParameterizedConstructor(1, 2, 13);
		
	      /* This will invoke the constructor 
	       * with int and String parameters
	       */
		   ParameterizedConstructor obj4 = new ParameterizedConstructor(1,"BeginnersBook");
	   }
}
