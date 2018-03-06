// same o/p as Thread01 but here we EXTEND THREAD CLASS instead of implementing RUNNABLE INTERFACE
public class Thread02 extends Thread
{
	  // Construct a new thread.
	  Thread02(String name) 
	  {
	    super(name); // name thread
	    start(); // start the thread
	  }

	  // Begin execution of new thread.
	  public void run() 
	  {
		  System.out.println(getName() + " starting.");
		  try 
		  {
			  for(int count=0; count < 10; count++) 
			  {
				  Thread.sleep(400);
				  System.out.println("In " + getName() +", count is " + count);
			  }
		  }
		  catch(InterruptedException exc) 
		  {
			  System.out.println(getName() + " interrupted.");
		  }

		  System.out.println(getName() + " terminating.");
	  }
	
}
