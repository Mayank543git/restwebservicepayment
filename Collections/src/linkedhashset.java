import java.util.LinkedHashSet;

public class linkedhashset {
	public static void main(String args[])
	{
		LinkedHashSet  v= new LinkedHashSet();
		v.add("Mumbai");
		v.add("Agra");
		v.add("Kolkata");
		v.add("Banglore");
		v.add("Jaipur");
		v.add("Bhopal");
		v.add("Pune");
		v.add(null);
		System.out.println("Elements of linked hash set are "+v);
		System.out.println("Size of linked hash set is "+v.size());
		java.util.Iterator<String> i = v.iterator();
		System.out.println("Traversed ");
		while(i.hasNext())
		{
			
			System.out.println(i.next());
			
		}
		v.remove("Agra");
		System.out.println("new linked hash set is"+v);
		System.out.println("new linked hash set size is "+v.size());
		}
		
		
		
		
		
	}


