/*It do not maintain order of insertion*/


import java.util.*;
public class HashSetDemo {
	public static void main(String args[]) {
		
		HashSet<String> hs=new HashSet();
		hs.add("Apple");
		hs.add("Mango");
		hs.add("Green Apple");
		hs.add("Banana");
		
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
