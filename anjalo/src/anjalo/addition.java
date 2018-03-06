package anjalo;

public class addition 
{
	
	int add(int a,int b)
	{
		return(a+b);
	}

	public static void main(String[] args) 
	{
		int a,b;
		a=5;b=4;
		addition A=new addition();

		System.out.println(A.add(a,b));

	}

}
