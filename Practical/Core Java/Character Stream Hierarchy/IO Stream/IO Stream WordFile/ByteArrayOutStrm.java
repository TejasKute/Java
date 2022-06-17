package corejava;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutStrm {

	public static void main(String args[])throws Exception{    
		
			//Creating FileOutputStream object
	      FileOutputStream fout1=new FileOutputStream("D:\\myFile.txt");    
	      FileOutputStream fout2=new FileOutputStream("D:\\CopyOfmyFile.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(67);    
	      
	      //String s = "Good Morning Everyone !!";
	      //byte b[] = s.getBytes();
	      //bout.write(b);
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
	      
	      System.out.println("Success...");    
	     }    
	}