
//Java Program To Read Contents From A File Into Byte Array

package corejava;

import java.io.*;
 
public class ByteArrayRead { 
	
  public static void main(String a[]) throws IOException{   
	  	
	  	//Take A File Location In String Variable
        String fn = "D:\\Dynamite.txt";
        
        //Create Object of InputStream Class
        InputStream f = null;
        
        //Exception Handle By Using Try & Catch Block
        try {
        	//Give Location to FileInputStream
        	f = new FileInputStream(fn);
            
        	//Declare Byte Array
            byte fc[] = new byte[2048];
            
            //Initialize and Declare the read variable
            int rc = 0;
            
            //Iterate Array To Print Array Content By Using While loop
            while((rc = f.read(fc)) > 0){
                System.out.println(new String(fc, 0, rc -1));
            }
            
        } 
        
        catch (Exception exp) {
        	System.out.println(exp);
        }
  	}
 }
        
        