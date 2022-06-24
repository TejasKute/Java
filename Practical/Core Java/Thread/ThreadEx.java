package corejava;

class ThreadEx extends Thread
{
// Initiated Run Method For Thread
public void run() 
{
	System.out.println("Thread Started Running...");
}
	public static void main(String[] args) 
	{
		ThreadEx te=new ThreadEx();
			//Invoke Thread
				te.start();
	}
}
