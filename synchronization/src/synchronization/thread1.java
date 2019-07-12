package synchronization;

public class thread1 extends Thread {
	
	test t;  
	thread1(test t){  
	this.t=t;  
	}
	public void run()
	{
		
	t.printTable(5);	
	}
	
	

}
