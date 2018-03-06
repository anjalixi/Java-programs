// creating a thread simple (implementing Runnable)
public class Thread01 implements Runnable
{
	Thread thrd;
	Thread01(String name)
	{
		thrd=new Thread(this,name);
		thrd.start();
	}


	public void run() 
	{
		System.out.println(thrd.getName()+" starting.");
		try
		{
			for(int count=0;count<10;count++)
			{
				Thread.sleep(400);
				System.out.println("In "+thrd.getName()+" ,count is "+count);
			}
		}
		catch(InterruptedException exc)
		{
			System.out.println("Interupption of "+thrd.getName());
		}
		System.out.println(thrd.getName()+" is terminating");
	}

}
