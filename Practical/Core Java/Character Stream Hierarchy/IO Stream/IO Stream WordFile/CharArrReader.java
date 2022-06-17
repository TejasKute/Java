package corejava;

import java.io.CharArrayReader;  

public class CharArrReader{  
  public static void main(String[] ag) throws Exception {  
	  
    char[] ary = { 'T', 'E', 'J', 'A', 'S',' ', 'S',' ', 'K', 'U', 'T', 'E' };  
     
    CharArrayReader reader = new CharArrayReader(ary);  
    
    int k = 0;  
    // Read until the end of a file  
    while ((k = reader.read()) != -1) {  
    	 
      char ch = (char) k;  
      System.out.print(ch + " : ");  
      System.out.println(k);  
    }  
  }  
}
