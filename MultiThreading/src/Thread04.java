// RUN THIS : : IsAlive()  // Uses Base class Thread03
public class Thread04 
{

	public static void main(String[] args) 
	{	System.out.println(" Min Thread Starting");
		Thread03 mt1=new Thread03("child 1");
		Thread03 mt2=new Thread03("child 2");
		Thread03 mt3=new Thread03("child 3");
		do
		{
			System.out.print(".");
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException exc)
			{
				
			}
		}while(mt1.thrd.isAlive()||mt2.thrd.isAlive()||mt3.thrd.isAlive());
		System.out.println(" MAIN THREAD TERMINATED");

	}

}
