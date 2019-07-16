import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {
	
	
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tasks to be done ");
		int n =sc.nextInt();
		////// used fixed pool executor
		 ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		
		for(int i=0;i<n;i++)
		{
			
			Task t = new Task("Task "+i);
			System.out.println("Created "+t.getname());
			
			executor.schedule(t, 5, TimeUnit.SECONDS);
			
			 
	       
	    }
		try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
      } catch (InterruptedException e) {
            e.printStackTrace();
      }
       
		 executor.shutdown();
	        System.out.println("Finished all tasks successfully");
			
			
			
		}
	
		
		
		
		
	}	



