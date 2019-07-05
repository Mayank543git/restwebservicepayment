package abstractexample;

public abstract class Vechicle {
	
	Vechicle()
	{
		System.out.println("Vechicle is created ");
	}
	void runonroad()
	{
		System.out.println("Vechicle is running on road ");
	}
	
	abstract void speedUp(int a);
	
	abstract void changeGear(int b);

}
