// Run this
public class Thread01p2 
{

	public static void main(String[] args) 
	{
		System.out.println(" Main thread Starting");
		Thread01 mt=new Thread01("Child #1");
		for(int i=0;i<50;i++)
		{
			System.out.println(".");
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException exc)
			{
				System.out.println("Main Thread Interrupted");
			}
		}
		System.out.println(" Main Thread ending");

	}

}
