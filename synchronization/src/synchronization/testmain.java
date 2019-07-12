package synchronization;

public class testmain {
	
	public static void main(String args[])
	{
		///to demonstrate synchronization
		
		test obj = new test();
		thread1 t1 = new thread1(obj);
		thread2 t2 = new thread2(obj);
		t1.start();
		t2.start();
		
	}
	
	

}
