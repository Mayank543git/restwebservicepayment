import java.util.TreeSet;

public class Treeset {
	public static void main(String args[])
	{
	
TreeSet v = new TreeSet();

v.add("Mumbai");
v.add("Agra");
v.add("Kolkata");
v.add("Banglore");
v.add("Jaipur");
v.add("Bhopal");
v.add("Pune");
System.out.println("Elements of tree set are "+v);
System.out.println("Size of treeset is "+v.size());
java.util.Iterator<String> i = v.iterator();
System.out.println("Traversed ");
while(i.hasNext())
{
	
	System.out.println(i.next());
	
}
v.remove("Agra");
System.out.println("new treeset is"+v);
System.out.println("new treeset size is "+v.size());
}
}