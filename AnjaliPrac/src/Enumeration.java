enum Transport
{
	CAR,TRUCK,AIRPLANE,TRAIN,BOAT
}

public class Enumeration {

	public static void main(String[] args) 
	{
		Transport tp;
		tp=Transport.AIRPLANE;
		
		//o/p an enum value
		System.out.println(" Value: "+ tp+"\n");
		
		tp=Transport.TRAIN;
		if(tp==Transport.TRAIN)
			System.out.println("System Contains Train);");
		
		switch(tp)
		{
		case CAR: System.out.println(" A car");
					break;
		case TRUCK: System.out.println(" A truck");
					break;
		case AIRPLANE: System.out.println(" An airplane");
					break;
		case TRAIN: System.out.println(" A train");
					break;
		
		case BOAT: System.out.println(" A boat");
					break;
		}
	}

}
