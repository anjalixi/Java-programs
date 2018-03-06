// 2. APPLICATION 2 OF SYNCHRONIZATION (synchronized method calls)
public class Thread07_sumArray 
{
	private int sum;  
	  
	  int sumArray(int nums[]) 
	  {  
	    sum = 0; // reset sum  
	  
	    for(int i=0; i<nums.length; i++) 
	    {  
	      sum += nums[i];  
	      System.out.println("Running total for " + Thread.currentThread().getName() +  " is " + sum);   
		             
	            
	      try 
	      {  
	        Thread.sleep(10); // allow task-switch  
	      }  
	      catch(InterruptedException exc) 
	      {  
	        System.out.println("Thread interrupted.");  
	      }  
	    }  
	    return sum; 
	  }  
}
