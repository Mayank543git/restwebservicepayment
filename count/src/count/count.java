package count;

import java.util.Scanner;

public class count {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char arr[]=s.toCharArray();
		int len = s.length();
		for(int i=0;i<len;i++)
		{
		
			int count=0;
		if(arr[i]=='*')
		{
			continue;
		}
		else
		{
			char temp=arr[i];
			for(int j=i;j<len;j++)
			{
				
				if(temp==arr[j])
				{
					count++;
				arr[j]='*';	
				}
				
				
			}
			System.out.println(temp+" occured "+count+" times" );
			count=0;
			
			
		}
			
			
		}
		
		
		
		
		
		
	}

}
