package corejava;

import java.util.*; 
	
	public class TS{  
		
		public static void main(String args[]){  
				
				//Creating and adding elements  
				TreeSet<String> set=new TreeSet<String>();  
				set.add("Anuja");  
				set.add("Tejas");  
				set.add("Jayashree");  
				set.add("Shubham");  
				
				//traversing elements  
				Iterator<String> itr=set.iterator();  
				while(itr.hasNext()){  
					System.out.println(itr.next());  
					
				}  
			}  
		}
