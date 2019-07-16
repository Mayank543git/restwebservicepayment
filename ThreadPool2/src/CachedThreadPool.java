import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CachedThreadPool {
	
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tasks to be done ");
		int n =sc.nextInt();
		////// used fixed pool executor
		ThreadPoolExecutor executor =(ThreadPoolExecutor)Executors.newCachedThreadPool();
		
		for(int i=0;i<n;i++)
		{
			
			Task t = new Task("Task "+i);
			System.out.println("Created "+t.getname());
			executor.execute(t);
	         
	       
	    }
		
		 executor.shutdown();
		
	       
			
			
			
		}
	
	
	

}
