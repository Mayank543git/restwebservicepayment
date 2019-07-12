package synchronization;

public class thread2 extends Thread{
	
	
	
	test t;  
	thread2(test t){  
	this.t=t;  
	}
	public void run()
	{
		
	t.printTable(2);	
	}
	
	
	

}
