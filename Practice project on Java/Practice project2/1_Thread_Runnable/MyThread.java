package practicePrograms;

public class MyThread extends Thread
{
 	public void run()
 	{
  		System.out.println("The concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		MyThread thread = new  MyThread();
  		thread.start();
 	}
}
