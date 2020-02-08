package Assignment4;

public class Car extends Vehicle {
	public static double turningRadius;
	public void start(Vehicle v1)
	{

		try{
			System.out.println(((Car)v1).turningRadius);
		}
		catch (Exception e)
		{
			System.out.println("We have an exception here here are the details\n" + e.getMessage());
		}

	}
	
	
}
