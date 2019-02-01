import java.util.*;
public class HashMapDemo {
	public static void main(String args[]) {
		HashMap<IntDemo,Student> hm=new HashMap();
		hm.put(new IntDemo(1), new Student(101,"Alice"));
		hm.put(new IntDemo(2), new Student(102,"Ally"));
		
		System.out.println(hm);
		
		for(Map.Entry<IntDemo,Student> es:hm.entrySet()) {
			IntDemo key=es.getKey();
			Student s=es.getValue();
			System.out.println(key+" "+s);
		}
	}

}
