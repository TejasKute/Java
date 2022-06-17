package corejava;

import java.io.FileInputStream;

public class FileInStrm {

	public static void main(String args[]) {
		try
		{
			//Creating FileInputStream object
			FileInputStream fin = new FileInputStream("D:\\myFile.txt");
			
			int i = 0;
			
			//Call Read() Method By Using While Loop
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}