// using methods values() and valueOf()
enum Transporte
{
	CAR,TRUCK,AIRPLANE,TRAIN,BOAT
}

public class Enumeration2 
{

	public static void main(String[] args) 
	{
		Transporte tp;
		System.out.println("Here are all the Transport Constants");
		// values()
		Transporte allTransports[]=Transporte.values();
		for(Transporte t:allTransports)
			System.out.println(t);
		System.out.println();
		
		//valueOf()
		tp=Transporte.valueOf("AIRPLANE");
		System.out.println("tp contains"+ tp);
		
		
		
	}

}
