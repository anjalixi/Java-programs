// multiple threads' base class 
public class Thread03 implements Runnable
{
	Thread thrd;
	Thread03(String name)
	{
		thrd=new Thread(this,name);
		thrd.start();
	}
	public void run()
	{
		System.out.println(thrd.getName()+ " starting");
		try
		{
			for(int count=0;count<10;count++)
			{
				Thread.sleep(400);
				System.out.println("In "+thrd.getName()+ " the count is "+count);
			}
		}
		catch(InterruptedException exc)
		{
			System.out.println(thrd.getName()+ " interrupted");
		}
		System.out.println(thrd.getName()+" terminating");
	}
}
