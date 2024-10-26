package Collections_Program;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList(1000);
		ArrayList al3 = new ArrayList(al1);
		System.out.println("Size of al1 before adding element = " + al1.size());
		al1.add("Ron");
		al1.add("Wisely");
		al1.add("datta");
		System.out.println("Content of al1 = " + al1);
		System.out.println("Size of al1 after adding element = " + al1.size());
		for (int i = 10; i < 20; i++) {
			al1.add(i);
		}
		System.out.println("Content of al1 = " + al1);
		al1.add(3, 123456);
		System.out.println("Content of al1 after adding element 123456 = " + al1);
		System.out.println(al1.contains(1234567));
		System.out.println(al1.indexOf(12));
		al1.remove(6);
		System.out.println("Content of al1 after removing index 6 = " + al1);
		System.out.println("******************************");
	}
}
