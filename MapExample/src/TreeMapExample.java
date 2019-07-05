
	import java.util.LinkedHashMap;
import java.util.Map;
	import java.util.Scanner;
	import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Map<Integer,String> map = new TreeMap<Integer,String>();
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
