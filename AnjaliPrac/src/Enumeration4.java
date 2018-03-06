// using ordinal() and compareTo()
enum Trans
{
	CAR,TRUCK,AIRPLANE,TRAIN,BOAT
}
public class Enumeration4 
{
	public static void main(String args[])
	{
		Trans tp,tp2,tp3;
		System.out.println("HERE ARE ALL THE CONSTANTS AND THEIR ORDINALS");
		for(Trans t:Trans.values())
			System.out.println(t+" "+t.ordinal());
		
		tp=Trans.AIRPLANE;
		tp2=Trans.TRAIN;
		tp3=Trans.AIRPLANE;
		
		if(tp.compareTo(tp2)<0)
			System.out.println(tp + " comes before "+tp2);
		if(tp.compareTo(tp2)>0)
			System.out.println(tp + " comes after "+tp2);
		if(tp.compareTo(tp3)==0)
			System.out.println(tp + " equals "+tp3);
	}
}
