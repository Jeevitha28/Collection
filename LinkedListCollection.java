import java.util.*;
public class LinkedListCollection 
{
	public static void main(String args[]) {
		
		LinkedList<String> l=new LinkedList();
		l.add("BMW");
		l.add("Audi");
		l.add("Hyundai");
		
		ListIterator it=l.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
