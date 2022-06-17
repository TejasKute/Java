package corejava;

import java.io.*;  

public class BufferWriterExpression{

public static void main(String[] args) throws Exception {     
	
	//Creating FileWriter object
    FileWriter writer = new FileWriter("D:\\myFile.txt");  
	
  //To read from the created file
    BufferedWriter buffer = new BufferedWriter(writer);  
	
    buffer.write("Welcome to My World");  
	
    //Call close() Method
    buffer.close();  
	
    System.out.println("Success");  
	
    } 
}