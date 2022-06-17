
package corejava;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class JavaTriviaGame 
{
//Creating Static Variables
public static int[] points = { 2, 3, 2, 3, 5 };
public static String[] answers = { "DELHI", "MUMBAI", "TIGER", "HOCKEY", "LOTUS" };

//creating static trivialMehtod which takes 2 String parameters
public static int triviaMethod(String[] questions, String[] stt) 
{
	Scanner sc = new Scanner(System.in);
	String str;
	int point = 0;
	for (int i = 0; i < 5; i++) 
	{
		System.out.println(questions[i]);
		System.out.println(stt[i]);
		if (stt[i].toUpperCase().equals(answers[i])) 
		{
			System.out.println("Correct!");
		point += points[i];
		System.out.println("");
	} 
	else 
	{
		System.out.println("Wrong answer");
		System.out.println("Correct Answer is : " + answers[i]+"\n");
		}
	}
	return point;
}
public static void main(String[] args) 
{
	int point;
	Scanner sc = new Scanner(System.in);
	String[] stt = new String[5];
	//adding questions
String[] questions = { 
		"Question 1: What is the capital of INDIA ?",
		"Question 2: What is the capital of MAHARASHTRA ?",
		"Question 3: What is the National Animal of INDIA ?",
		"Question 4: What is the National Game of INDIA ?",
		"Question 5: What is the National Flower of INDIA ?",
};
for (int i = 0; i < 5; i++) 
{
	System.out.println(questions[i]);
	System.out.print("Enter Your Ans: ");
	stt[i] = sc.nextLine();
	System.out.print("\n");
}
point = triviaMethod(questions, stt);
System.out.println("Final score: " + point);
	}
}