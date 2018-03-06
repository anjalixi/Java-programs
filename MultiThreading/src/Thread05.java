// RUN THIS : Uses JOIN method to check if all strings are terminated , joined before ending main string//
public class Thread05 
{

	public static void main(String[] args) 
	{
		System.out.println(" Min Thread Starting");
		Thread03 mt1=new Thread03("child 1");
		Thread03 mt2=new Thread03("child 2");
		Thread03 mt3=new Thread03("child 3");
		
		try
		{
			mt1.thrd.join();
			System.out.println("child 1 has joined");
			mt2.thrd.join();
			System.out.println("child 2 has joined");
			mt3.thrd.join();
			System.out.println("child 3 has joined");
		}
		catch(InterruptedException esc)
		{
			System.out.println(" Main Thread Interrupted");
		}
		System.out.println("Main Thread Ending");

	}

}
