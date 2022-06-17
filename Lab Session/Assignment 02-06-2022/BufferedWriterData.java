
//Java Program BufferWriter To Write Data To A File
package corejava;

import java.io.*;

public class BufferedWriterData {

	public static void main(String[] args) throws Exception { 
		
		//Creating Object of FileWriter class and assigning location
	    FileWriter w = new FileWriter("D:/myFile.txt");  
	    
		// Creating Object of BufferedWriter class
	    BufferedWriter bw = new BufferedWriter(w); 
	    
		//Writing The Data To File Using BufferWriter Object
	    bw.write("Jay Hind, Jay Maharashtra");  
	    
		//Close BufferWriter
	    bw.close();  
	    
		//When Successfully Executed Above Code Then Print Below Message
	    System.out.println("Successfully Stored... ");  
		
	    } 
}