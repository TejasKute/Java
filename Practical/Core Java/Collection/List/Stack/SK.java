package corejava;

import java.util.*;  

	public class SK{  
		public static void main(String args[]){  
			Stack<String> stack = new Stack<String>();  
			stack.push("Anuja");  
			stack.push("Tejas");  
			stack.push("Jayashree");  
			stack.push("Shubham");  
			//stack.pop();
			stack.push("Ruepsh");
			
			  
			Iterator<String> itr=stack.iterator();  
				while(itr.hasNext()){  
					System.out.println(itr.next());  
				}  
		}  
	}  
