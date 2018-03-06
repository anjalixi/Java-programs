//02

public class FixedQueue
{

	private char q[];
	private int putloc,getloc;
	public void FixedQueue(int size)
	{
		q=new char[size];
		putloc=getloc=0;
	}
	public void put(char ch)
	{
		if(putloc==q.length)
		{
			System.out.println("Full");
			return;
		}
		q[putloc++]=ch;	
	}
	public char get()
	{
		if(getloc==putloc)
		{
			
			System.out.println("Empty");
			return(char) 0;
		}
		return q[getloc++];
		
	}
}
