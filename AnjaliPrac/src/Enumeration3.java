// adding methods(functs) and constructors and initial values
enum Transporto
{
	CAR(65),TRUCK(55),AIRPLANE(600),TRAIN(70),BOAT(22);
	private int speed;
	Transporto(int s)
	{
		speed=s;
	}
	int getSpeed()
	{
		return speed;
	}
}

public class Enumeration3 
{

	public static void main(String[] args) 
	{
		
		System.out.println("The average speed of an airplane"+Transporto.AIRPLANE.getSpeed() +" miles per hour\n");
		
		System.out.println("ALL SPEEDS: ");
		for(Transporto t:Transporto.values())
		{
			System.out.println(t+"  "+t.getSpeed()+"mph");
		}

	}

}
