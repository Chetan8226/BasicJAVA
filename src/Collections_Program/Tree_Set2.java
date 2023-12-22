package Collections_Program;

import java.net.MulticastSocket;
import java.util.TreeSet;

public class Tree_Set2 
{

	public static void main(String[] args) 
	{
		TreeSet ts1=new TreeSet();// 1
		//ts1.add(null);
		ts1.add("Harry");
		ts1.add("Dobby");
		System.out.println(ts1);
		ts1.add("abc");
		ts1.add("bcd");
		System.out.println("before = " + ts1);
		System.out.println(ts1.pollFirst());
		System.out.println(ts1.pollLast());
		TreeSet ts2=new TreeSet();// 2
		ts2.add(10);
		ts2.add(30);
		System.out.println(ts2);
		/*ts2.add("Ron")
		System.out.println(ts2);*/
	}

}
