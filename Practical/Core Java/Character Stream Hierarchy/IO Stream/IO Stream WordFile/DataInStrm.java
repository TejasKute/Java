
package corejava;

import java.io.*;    

public class DataInStrm {  
	
  public static void main(String[] args) throws IOException {  
	  
	//Creating InputStream object
    InputStream input = new FileInputStream("D:\\myFile.txt"); 
    
    //To read from the created file
    DataInputStream inst = new DataInputStream(input); 
    
    int count = input.available();  
    
    byte[] ary = new byte[count];  
    inst.read(ary);  
    
    for (byte bt : ary) {  
    	 //Conversion of a byte into character
      char k = (char) bt;  
      System.out.print(k+"-");  
    }  
  }  
}  
