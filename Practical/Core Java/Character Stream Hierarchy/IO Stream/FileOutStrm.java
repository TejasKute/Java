package corejava;

import java.io.FileOutputStream;

public class FileOutStrm {

	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\myFile.txt");
			
			// With Integer data type
			fout.write(65);

			// With String data type
//			String s = "Good Morning Everyone !!";
//			byte b[] = s.getBytes();
//			fout.write(b);

			fout.close();
			System.out.println("success...");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}