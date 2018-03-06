// SYNCHRONIZED CALL TO METHOD BY PUTTING THE CALL INTO A 'synchronized" block
public class Thread07p2 implements Runnable
{
	Thread thrd;  
	  static Thread07_sumArray sa = new Thread07_sumArray();  
	  int a[];  
	  int answer; 
	 
	  // Construct a new thread.  
	  Thread07p2(String name, int nums[]) 
	  {  
	    thrd = new Thread(this, name);  
	    a = nums;  
	    thrd.start(); // start the thread  
	  }  
	  
	  // Begin execution of new thread.  
	  public void run() 
	  {  
	      
	  
	    System.out.println(thrd.getName() + " starting.");  
	  
	    // synchronize calls to sumArray()  
	    synchronized(sa) 
	    {  
	      answer = sa.sumArray(a);           
	    }  
	    System.out.println("Sum for " + thrd.getName() +  " is " + answer); 
	                        
	  
	    System.out.println(thrd.getName() + " terminating.");  
	  }  
}
