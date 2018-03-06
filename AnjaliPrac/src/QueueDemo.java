
public class QueueDemo 
{
	private char q[];
	private int putloc,getloc;
	QueueDemo(int size)
	{
		q=new char[size];
		putloc=getloc=0;
	}
	void put(char ch)
	{
		if(putloc==q.length)
		{
			System.out.println("Full");
			return;
		}
		q[putloc++]=ch;	
	}
	char get()
	{
		if(getloc==putloc)
		{
			
			System.out.println("Empty");
			return(char) 0;
		}
		return q[getloc++];
		
	}

	
	public static void main(String[] args) 
	{
		QueueDemo BigQ=new QueueDemo(100);
		QueueDemo SmallQ=new QueueDemo(4);
		char ch=0;
		int i;
		
		//entering elements of BigQ
		for(i=0;i<26;i++)
			BigQ.put((char)('A'+i));
		//displaying elements of BigQ
		for(i=0;i<26;i++)
		{
			ch=BigQ.get();
			if(ch!=(char)0)
				System.out.print(ch+" ");
		}
		System.out.println("\n");
		
		//errors in smallq
		for(i=0;i<5;i++)
		{
			System.out.println("Attempting to store"+(char)('Z'-i));
			SmallQ.put((char)('Z'-i));
	
		}
	}

}
