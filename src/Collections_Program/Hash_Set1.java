package Collections_Program;

import java.util.HashSet;

public class Hash_Set1 {
	public static void main(String[] args) {
		HashSet hs1 = new HashSet();// capacity = 16 LF=0.75
		HashSet hs2 = new HashSet(1000);// capacity = 1000
		HashSet hs3 = new HashSet(1000, 90);// capacity = 1000 LF=90
		HashSet hs4 = new HashSet(hs1);
		hs1.add("Manual");
		hs1.add("B");
		hs1.add("a");
		hs1.add('#');
		hs1.add(20);
		System.out.println(hs1);
		hs1.add("A");
		System.out.println(hs1);
		hs1.add(null);
		System.out.println(hs1);
		hs1.add(null);
		System.out.println(hs1);
		hs1.add("a");
		System.out.println(hs1);
	}
}
