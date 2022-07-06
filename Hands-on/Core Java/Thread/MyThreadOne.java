
//Add a step method in the welcome thread of question 1 to delay its execution for 200ms.
package corejava;

public class MyThreadOne extends Thread 
{
  // Initiated run method for thread
  public void run() 
  {
    int i = 0;
    while (i<10) 
    {
      System.out.println("Good Morning");
  try 
  {
    Thread.sleep(200);
  } 
  catch (InterruptedException i1) 
  {
    i1.printStackTrace();
  }
  System.out.println("Welcome to Mumbai");
      i++;
    }
  }
  public static void main(String[] args) 
  {
    MyThreadOne th = new MyThreadOne();
    // Invoking Thread
    th.start();
  }
}