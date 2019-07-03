import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class arraylist {
	
	public static void main(String args[])
	{
		
		ArrayList al = new ArrayList();
		al.add("Agra");
		al.add("Bombay");
		al.add("Calcutta");
	al.add("Delhi");
	System.out.println(al);
	
	ListIterator lisiterator =  al.listIterator();
	while(lisiterator.hasNext())
	{
		
		System.out.println(lisiterator.next());
		
	}
	al.remove("Agra");
	System.out.println(al);
	al.remove(0);
	System.out.println(al);
	al.add(0, "Kolkata");
	System.out.println(al);
	al.add(1,"Mumbai");
	
	al.add(0,"Agra");
	al.add(0,"Banglore");
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	al.set(1, "France");
	System.out.println(al);
	
	ArrayList al2 = new ArrayList();
	al2.addAll(al);
	System.out.println("al2 array list" +al2);
		
	}

}
