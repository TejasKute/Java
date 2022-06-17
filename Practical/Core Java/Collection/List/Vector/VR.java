package corejava;

import java.util.*;  
	public class VR{  
		public static void main(String args[]){  
			Vector<String> v=new Vector<String>();  
			v.add("Anuja");  
			v.add("Tejas");  
			v.add("Jayashree");  
			v.add("Shubham");  

			Iterator<String> itr=v.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
			}  
		}  
	}  
