
import java.util.Scanner;


public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println(" FACTORIAL ");
		System.out.println(" Enter Number");
		int n=in.nextInt();
		int f=1;
		for(int i=n;i>0;i--)
			f*=i;
		System.out.println(" The factorial is "+f);
		in=null;
			
		

	}
}
