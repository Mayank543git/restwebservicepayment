package alphacount;

import java.util.Scanner;

public class AlphaCount {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		int count=0;
		for(int i=0;i<len;i++)
		{
			if((s.charAt(i)>=48)&&(s.charAt(i)<=57))
			{
				count++;
			}
			
		}
		System.out.println("The Count of Digits is "+count);
		
		
		
		
		
	}
	
	

}
