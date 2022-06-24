package corejava;

public class ThreadExOne implements Runnable 
{
		// Initiated Run Method For Thread
public void run() 
{
	System.out.println("Thread is Running Successfully...");
}
public static void main(String[] args) 
{
	ThreadExOne te=new ThreadExOne();
	Thread t= new Thread(te);
	//Invoke Thread
		t.start();
	}
}


