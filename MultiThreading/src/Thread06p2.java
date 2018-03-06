
public class Thread06p2 implements Runnable
{
	Thread thrd;
	static Thread06_sumArray sa=new Thread06_sumArray();
	int a[];
	int answer;
	Thread06p2(String name,int nums[])
	{
		thrd=new Thread(this,name);
		a=nums;
		thrd.start();
		
	}
	
	public void run() 
	{
		System.out.println(thrd.getName()+" starting");
		answer=sa.sumArray(a);
		System.out.println("Sum for "+thrd.getName()+" is "+answer);
		System.out.println(thrd.getName()+" terminating");
		
	}


}
