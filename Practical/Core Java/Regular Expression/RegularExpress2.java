package corejava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpress2 {
   public static void main(String[] args) {
	   
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter input text: ");
      
      String input = sc.nextLine();
      String regex = "[^A-Z]";
      
      //Creating a pattern object
      Pattern pattern = Pattern.compile(regex);
      
      //Matching the compiled pattern in the String
      Matcher matcher = pattern.matcher(input);
      
      int count =0;
      if (matcher.find()) {
    	  
         System.out.println("match occurred");
      } else {
         System.out.println("match not occurred");
      }
   }
}