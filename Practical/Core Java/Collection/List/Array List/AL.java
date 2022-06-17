package corejava;

import java.util.*;  
	class AL{  
		public static void main(String args[]){  
				ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
				list.add("Anuja");//Adding object in arraylist  
				list.add("Tejas");  
				list.add("Jayashree");  
				list.add("Shubham");  
				
					//Traversing list through Iterator  
				Iterator itr=list.iterator();  
					while(itr.hasNext()){  
						System.out.println(itr.next());  
					}  
		}  
	}  
