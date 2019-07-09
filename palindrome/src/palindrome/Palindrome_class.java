package palindrome;

import java.util.Scanner;

public abstract class Palindrome_class implements ispalindrome {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		ispalindrome ip = (a) -> {    
			boolean ispalindrome=true;
			for(int i=0;i<a.length()/2;i++)
			{
				if(a.charAt(i)!=a.charAt(s.length()-i-1))
				{
					
					ispalindrome=false;
					break;
					
				}
				
				
				
			}
			if(ispalindrome)
			{
				System.out.println("It is palindrome");
			}
			else
			{
				System.out.println("It is not palindrome");
			}
		
			
			
			
			
			
			
		};
		ip.ipalindrome(s);
	
	}


	
	

}
