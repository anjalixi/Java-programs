
public class Thread03p2 

{

	public static void main(String[] args) 
	{
		System.out.println("Main Thread Starting.");
		Thread03 mt1=new Thread03("Child #1");
		Thread03 mt2=new Thread03("Child #2");
		Thread03 mt3=new Thread03("Child #3");
		
		for(int i=0;i<50;i++)
		{
			System.out.print(".");
			try
			{
				Thread.sleep(400);
			}
			catch(InterruptedException exc)
			{
				System.out.println("Main Thread Interrupted");
			}
			
			
		}
		System.out.println("Main Thread ending.");

	}

}
