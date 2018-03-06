
// 1. APPLICATION 1 OF SYNCHRONIZATION (synchronized methods)
// When 'synchronized' method is called, the callling thread enters the object's monitor, and locks that object.
// When locked, no other thread can enter that method. When the thread returns, the monitor unlocks the object,
// next thread can use it.
public class Thread06_sumArray 
{
	private int sum;
	synchronized int sumArray(int nums[])   // Try removing'synchronized' sum gets corrupted af
	{
		sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
			System.out.println("Running Total for "+Thread.currentThread().getName()+" is "+sum);
			try
			{
				Thread.sleep(10); // allow task switch
			}
			catch(InterruptedException exc)
			{
				
			}
			
		}
		return sum;
	}
}
