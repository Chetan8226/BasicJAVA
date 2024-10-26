package Collections_Program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		HashMap hm1 = new HashMap();
		HashMap hm2 = new HashMap(1000);
		HashMap hm3 = new HashMap(100, 90);
		HashMap hm4 = new HashMap(hm3);
		hm1.put(4, "Google");
		hm1.put(3, "TCS");
		hm1.put(2, "Wipro");
		hm1.put(1, "KPMG");
		System.out.println(hm1);
		hm1.put(1, "Apple");
		System.out.println(hm1);
		hm1.put('A', 123);
		hm1.put('B', 999);
		hm1.put('C', 234);
		System.out.println(hm1);
		System.out.println("*****************");
		System.out.println("Key Set = " + hm1.keySet());
		System.out.println("Values = " + hm1.values());
		System.out.println("Entry Set = " + hm1.entrySet());
		Set al = hm1.entrySet();
		System.out.println("Cursor");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
