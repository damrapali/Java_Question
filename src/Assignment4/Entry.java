package Assignment4;

public class Entry extends Bike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v1 = new Vehicle();
		Car c1 = new Car();
		Car.turningRadius = 12;
		Bike b1= new Bike ();
		Bike.maxSpeed = 150;
		
		Vehicle v1= new Bike();
		Vehicle v2= new Car();
				
		v1.start(c1);
		v2.start(b1);
		
	
	}
	}
