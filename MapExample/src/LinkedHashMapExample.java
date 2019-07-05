import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class LinkedHashMapExample {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		String name="";
		for(int i=1;i<=5;i++)
		{
			name=sc.nextLine();
			map.put(i, name);
		}
		System.out.println(map);
		
		for(Map.Entry<Integer, String> m:map.entrySet())
		{
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
	
		
	
		
		
		
		
		
		
		
	}

}
