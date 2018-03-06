// RUN THIS
public class Thread07p3 
{
	public static void main(String args[]) {  
	    int a[] = {1, 2, 3, 4, 5};  
	  
	    Thread07p2 mt1 = new Thread07p2("Child #1", a);  
	    Thread07p2 mt2 = new Thread07p2("Child #2", a);  
	  
	    try 
	    {  
	      mt1.thrd.join();  
	      mt2.thrd.join();  
	    } 
	    catch(InterruptedException exc) 
	    {  
	      System.out.println("Main thread interrupted.");  
	    }  
	    
	  }  
}
