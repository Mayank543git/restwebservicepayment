import java.util.Scanner;

public abstract class gcd_lcm implements gcd_lcm_interace
{
public static void main(String args[])
{
	
Scanner sc = new Scanner(System.in);
int a1 = sc.nextInt();
int a2= sc.nextInt();


gcd_lcm_interace gl = (p1,p2) ->
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

gl.gcd_lcm_func(a1, a2);


	
	
	
	

}}
