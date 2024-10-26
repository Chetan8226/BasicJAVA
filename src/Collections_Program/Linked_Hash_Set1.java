package Collections_Program;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Linked_Hash_Set1 {

	public static void main(String[] args) {
		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add("B");
		lhs1.add("C");
		lhs1.add("A");
		lhs1.add(null);
		System.out.println(lhs1);
		lhs1.add(null);
		System.out.println(lhs1);
		System.out.println(lhs1.isEmpty());
		System.out.println(lhs1.size());
	}
}