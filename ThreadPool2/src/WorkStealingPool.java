import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class WorkStealingPool {
	
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tasks to be done ");
		int n =sc.nextInt();
		////// used fixed pool executor
		ExecutorService executor =Executors.newWorkStealingPool(3);
		
		for(int i=0;i<n;i++)
		{
			
			Task t = new Task("Task "+i);
			System.out.println("Created "+t.getname());
			
			executor.execute(t);
	         
	       
	    }
		
		 executor.shutdown();
	       
			
			
			
		}

}
