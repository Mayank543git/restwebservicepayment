import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {
	public static void main(String args[])
	{
		LinkedList al = new LinkedList();
		al.add(23);
		al.add(435);
		al.add(6564);
		al.add(5);
		al.add(1);
		al.add(67);
		System.out.println("Elements of Linked list are "+al);
		System.out.println("Size of linked list is "+al.size());
		System.out.println("Element at index 3 is "+al.get(3));
		System.out.println("head element is "+al.peek());
		ListIterator lisiterator =  al.listIterator();
		while(lisiterator.hasNext())
		{
			
			System.out.println(lisiterator.next());
			
		}
		System.out.println("Removed element at index 2 "+al.remove(2));
		LinkedList al2 = new LinkedList();
		al2.addAll(al);
		System.out.println("Contents of new linked list is "+al2);
		Collections.sort(al2);
		System.out.println("Sorted Elements of Linked list are "+al2);
		
		
		
		
		
		
	}

}
