package Collections_Program;

import java.util.LinkedList;

public class LinkList1 {
	public static void main(String[] args) {
		LinkedList ll1 = new LinkedList();
		LinkedList ll2 = new LinkedList();
		LinkedList<Integer> ll3 = new LinkedList<Integer>();
		System.out.println("Size = " + ll1.size());
		System.out.println("Is Empty = " + ll1.isEmpty());
		ll1.add("Harry");
		ll1.add("Potter");
		ll1.add("Rio");
		ll1.add(22);
		ll1.add(null);
		ll1.add('*');
		System.out.println("Index Value = " + ll1);
		ll1.add(null);
		System.out.println("After adding Null Element = " + ll1);
		System.out.println("Contains = " + ll1.contains("Rio"));
		ll1.addFirst("Chandrapur");
		System.out.println("After Adding Chandrapur in First Position = " + ll1);
		ll1.addLast(442401);
		System.out.println("After Adding 442401 in Last Position = " + ll1);
		System.out.println("Index of Element = " + ll1.indexOf("Rio"));
		ll1.removeFirst();
		System.out.println("After Remove First Element = " + ll1);
		ll1.removeLast();
		System.out.println("After Remove Last Element = " + ll1);
		ll1.addFirst("Chandrapur");
		System.out.println(ll1);
		ll1.addLast(442401);
		System.out.println(ll1);
		ll1.pollFirst();
		System.out.println(ll1);
		ll1.pollLast();
		System.out.println(ll1);
		System.out.println("************************");
		ll3.add(2);
		System.out.println("After Adding integer value = " + ll3);
	}
}
