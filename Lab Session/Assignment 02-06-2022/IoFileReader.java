
//Java program to show the usage of IO FileReader Class
package corejava;

import java.io.*;

public class IoFileReader {

	 public static void main(String args[]) throws IOException {
		 
	      //Creating FileReader object
	      File fri = new File("D:/myFile.txt");
	      
	      //To Read From The Created File
	      FileReader fr = new FileReader(fri);
	      
	      char c[] = new char[(int) fri.length()];
	      
	      //Reading Data From The File
	      fr.read(c);
	      
	      //Print 
	      System.out.println(c);
	      
	      //Close The FileReader Class
	      fr.close();
	   }
	}