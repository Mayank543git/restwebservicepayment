import java.util.concurrent.TimeUnit;

public class Task implements Runnable{
	private String name;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Start. task = "+name);
		
		
		 
	
			
		 long startTime = System.nanoTime();
		Long duration=(long)(Math.random()*10);
		
		System.out.println("Executing "+name);
		
		/////////////////////
		try {
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/////////////////////
		
		long endTime = System.nanoTime();
		 
	    long durationInNano = (endTime - startTime);  //Total execution time in nano seconds
	 System.out.println("the time for execution of task "+name+" is "+durationInNano);
	 System.out.println(Thread.currentThread().getName()+" End.");
	 System.out.println(name+" Finished");
		
		
		
		
	}
	public Task(String name)
	{
		
		this.name=name;
	}
	public String getname()
	{
		
		return name;
		
	}
	
	
	
	
	

}
