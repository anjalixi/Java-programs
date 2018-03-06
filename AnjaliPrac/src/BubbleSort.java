// DOES NOT WORK AS CODED. p141
import java.util.Scanner;



// @author Anjali_2

public class BubbleSort 
{


	public static void main(String[] args) 
	{
		int t=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter array length");
		int n;
		n=in.nextInt();
		int nums[]=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++)
		{
			nums[i]=in.nextInt();
		}
		for(int a=1;a<n;a++)
			for(int b=n-1;b>=a;b--)
			{	
				
				if(nums[b-1]>nums[b])
					t=nums[b-1];
					nums[b-1]=nums[b];
					nums[b]=t;
			}
		for(int f = 0;f<n;f++)
			System.out.print(nums[f]+"  ");
			
		
		
		

	}

}
