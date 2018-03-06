// RUN THIS :: ::
public class Thread06p3 
{

	public static void main(String[] args) 
	{
		int a[]={1,2,3,4,5};
		Thread06p2 mt1=new Thread06p2("Child 01",a);
		Thread06p2 mt2=new Thread06p2("Child 02",a);
		try
		{
			mt1.thrd.join();
			mt2.thrd.join();
		}
		catch(InterruptedException ed)
		{
			System.out.println(" Main Thread Interrupted");
		}
	

	}

}
