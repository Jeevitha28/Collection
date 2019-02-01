/*It maintains order of insertion*/


import java.util.*;
import java.util.Iterator;

public class LinkedHashSetDemo {
public static void main(String args[]) {
		
		LinkedHashSet<Integer> hs=new LinkedHashSet();
		hs.add(1);
		hs.add(2);
		hs.add(0);
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}




}
