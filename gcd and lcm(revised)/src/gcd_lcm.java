import java.util.Arrays;
import java.util.Scanner;

public abstract class gcd_lcm implements gcd_lcm_interace
{
	private static int gcd(int x, int y) {
		  return (y==0) ? x : gcd(y, x % y);
		}
		    
		private static int gcd(int... numbers) {
		  return Arrays.stream(numbers).reduce(0, (x, y) -> gcd(x, y));
		}
		    
		private static int lcm(int... numbers) {
		  return Arrays.stream(numbers).reduce(1, (x, y) -> x * (y / gcd(x, y)));
		}

public static void main(String args[])
{
	
Scanner sc = new Scanner(System.in);
System.out.println(gcd(5,25,125));

//int a1 = sc.nextInt();
//int a2= sc.nextInt();


/*gcd_lcm_interace gl = (p1,p2) ->
{
	int q1=p1;
	int q2=p2;
	while(p1!=p2)	
	{
	if(p1>p2)
	{
	p1=p1-p2;	
	}
	else
	{
	p2=p2-p1;	
	}

	}
	System.out.println("GCD is "+p1);
	System.out.println("LCM is "+(q1*q2)/p1);



	



};

//gl.gcd_lcm_func(a1, a2); */



	
	
	
	

}}
