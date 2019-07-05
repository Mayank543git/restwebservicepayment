package abstractexample;

public class Demo {
	public static void main(String args[])
	{
		
		Bike bike = new Bike();
		
		bike.runonroad();
		bike.changeGear(4);
		bike.speedUp(50);
		System.out.println("Bike :");
		bike.display();
		System.out.println();
		
		
		Car car = new Car();
		
		bike.runonroad();
		car.changeGear(5);
		car.speedUp(70);
		System.out.println("Car :");
		car.display();
		
	}

}
