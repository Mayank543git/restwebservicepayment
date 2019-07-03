import java.util.HashSet;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class sets {

	public static void main(String args[])
	{
		
		HashSet<String> v = new HashSet<String>();
		 
		v.add("Agra");
		
		v.add("Mumbai");
		v.add(null);
		v.add("Kolkata");
		v.add("Banglore");
		v.add("Jaipur");
		v.add("Bhopal");
		v.add("Pune");
		System.out.println("Elements of hash set are "+v);
	java.util.Iterator<String> i = v.iterator();
	System.out.println("Traversed ");
	while(i.hasNext())
	{
		
		System.out.println(i.next());
		
	}
	v.remove("Agra");
	System.out.println("new hashset is"+v);
	System.out.println("new hashset size is "+v.size());
	
		
		
		
	}
	
	
}
