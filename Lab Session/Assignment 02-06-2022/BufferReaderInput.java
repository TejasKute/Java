
//Java Program To Read Input Using BufferReader
package corejava;
import java.io.*;

public class BufferReaderInput {

	public static void main(String[] args) throws Exception {
		
		//Create FileReader Object
		FileReader fr = new FileReader("D:/Welcome.txt");
		
		//To Read From The Created File
		BufferedReader br = new BufferedReader(fr);
		
		int i;
		/* { Print Data / Message From File } */
		while ((i=br.read())!=-1){
			System.out.print((char)i);
			}
		
		br.close();
		fr.close();
						
	}
}