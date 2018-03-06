// RUN THIS : same o/p as Thread01p2
public class Thread02p2 
{

	public static void main(String[] args) 
	{
	    System.out.println("Main thread starting.");

	    Thread02 mt = new Thread02("Child #1");

	    for(int i=0; i < 50; i++) 
	    {
	    	System.out.print(".");
	    	try 
	    	{
	    		Thread.sleep(100);
	    	}
	    	catch(InterruptedException exc) 
	    	{
	    		System.out.println("Main thread interrupted.");
	    	}
	    } 

	    System.out.println("Main thread ending.");

	}

}
