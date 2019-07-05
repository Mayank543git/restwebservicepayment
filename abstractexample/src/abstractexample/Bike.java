package abstractexample;

public class Bike extends Vechicle{
int speed;
int gear;
	@Override
	void speedUp(int newspeed) {
		// TODO Auto-generated method stub
		speed=newspeed;
	}

	@Override
	void changeGear(int newgear) {
		// TODO Auto-generated method stub
		gear=newgear;
	}
	
	public void display()
	{
		
		System.out.println("Speed "+speed+" Gear "+gear);
		
	}

}
