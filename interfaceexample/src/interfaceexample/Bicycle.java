package interfaceexample;

public class Bicycle implements Vechicle {
int Speed;
int newgear;

@Override
public void SpeedUp(int incr_speed) {
	// TODO Auto-generated method stub
	Speed=Speed+incr_speed;
}
@Override
public void changeGear(int ChangedGear) {
	// TODO Auto-generated method stub
	newgear=ChangedGear;
}
@Override
public void applyBrakes(int decr_speed) {
	// TODO Auto-generated method stub
	Speed=Speed-decr_speed;
	
}
public void printStates()
{
	
System.out.println("Bicycle : Speed "+Speed+" newgear "+newgear);

}
	
}
