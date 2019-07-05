package interfaceexample;

public class Demo {
	public static void main(String args[])
	{
		Bicycle bicycle = new Bicycle();
		Bike bike = new Bike();
		Car car = new Car();
		
		bicycle.changeGear(3);
		bicycle.SpeedUp(15);
		bicycle.applyBrakes(2);
		
		System.out.println("Present State of Bicycle");
		bicycle.printStates();
		
		bike.changeGear(4);
		bike.SpeedUp(55);
		bike.applyBrakes(12);
		
		System.out.println("Present State of Bike");
		bike.printStates();
		
		
		car.changeGear(5);
		car.SpeedUp(100);
		car.applyBrakes(30);
		
		System.out.println("Present State of Car");
		car.printStates();
		
		
		
		
	}

}
