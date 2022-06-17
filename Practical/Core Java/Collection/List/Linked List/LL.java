package corejava;

import java.util.*;  
	public class LL{  
		public static void main(String args[]){  
			LinkedList<String> al=new LinkedList<String>();  
			al.add("Anuja");  
			al.add("Tejas");  
			al.add("Jayashree");  
			al.add("Shubham");  
			
			Iterator<String> itr=al.iterator();  
				while(itr.hasNext()){  
					System.out.println(itr.next());  
				}  
		}  
	}  
