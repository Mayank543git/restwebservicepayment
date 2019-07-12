package thread1;

public class thread1 extends Thread{
public void run()
{
	
System.out.println(Thread.currentThread().getName()+" Thread is Running");
for(int i=5;i>0;i--)
{
	
try {
	Thread.sleep(1000);
	System.out.println("Wait "+i+" "+this.getName());
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
	
}





}
	public static void main(String args[])
	{
		
		thread1 t1 = new thread1();
		thread1 t2 =new thread1();
		thread1 t3 =new thread1();
		System.out.println("name of first thread "+t1.getName());
		System.out.println("name of second thread "+t2.getName());
		System.out.println("name of third thread "+t3.getName());
		t1.setName("Mayank");
		t2.setName("Himanshu");
		t3.setName("Naman");
		System.out.println("Now the changed names are ");
		System.out.println("name of first thread "+t1.getName());
		System.out.println("name of second thread "+t2.getName());
		System.out.println("name of third thread "+t3.getName());
		t1.start();
		
		try {
			t1.join(); //join will wait for the currently executing thread to finish
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//setting priority of thread t2 and t3
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		t3.start();
	
		
//Making thread t4 as deamon
		thread1 t4 = new thread1();
		System.out.println("is t4 a deamon thread ? "+t4.isDaemon());
		t4.setDaemon(true);
		System.out.println("Setting t4 as a deamon thread");
		System.out.println("is t4 now a deamon thread ? "+t4.isDaemon());
	
		
		
		
		
		
	}
	
	
}
