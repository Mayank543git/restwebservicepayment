import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class vector {

	public static void main(String args[])
	{
		
		Vector v = new Vector();
		v.add("Agra");
		v.add("Mumbai");
		v.add("Kolkata");
		v.add("Banglore");
		v.add("Jaipur");
		v.add("Bhopal");
		v.add("Pune");
		System.out.println("Size of vector is "+v.size());
		System.out.println("elements of vector are "+v);
		v.addElement("Orrisa");
		System.out.println("new vector is "+v);
		System.out.println("Capacity of vector is "+v.capacity());
		v.removeElementAt(0);
		System.out.println("updated vector is"+v);
		Iterator vi = v.iterator();
		while(vi.hasNext())
		{
			
			System.out.println(vi.next());
			
		}
		Collections.sort(v);
		System.out.println("Sorted vector is "+v);
		
		
	}
	
	
}
