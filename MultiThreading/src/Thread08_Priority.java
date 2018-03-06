
public class Thread08_Priority implements Runnable
{
	int count;
	Thread thrd;
	static boolean stop=false;
	static String currentName;
	
	// constructor but without start()
	Thread08_Priority(String name)
	{
		thrd=new Thread(this,name);
		count=0;
		currentName=name;
	}
	public void run()
	{
		System.out.println(thrd.getName()+ " Starting");
		do
		{
			count++;
			if(currentName.compareTo(thrd.getName())!=0)
			{
				currentName=thrd.getName();
				System.out.println("In "+currentName);
			}
		}while(stop==false&&count<10000000); // first thread to reach 10,000,000 stops all other threads
		stop=true;
		System.out.println("\n"+thrd.getName()+" terminating");
	}

}
