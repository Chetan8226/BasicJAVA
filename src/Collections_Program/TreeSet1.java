package Collections_Program;

import java.util.TreeSet;

public class TreeSet1 
{

	public static void main(String[] args) 
	{
		TreeSet ts1=new TreeSet();
		ts1.add("Harry");
		ts1.add("Potter");
		System.out.println(ts1);
		//ts1.add(10);
		//System.out.println(ts1);
		TreeSet ts2=new TreeSet();
		ts2.add(10);
		System.out.println(ts2);
		ts2.add(null);// run time error = null.pointer.exception
		System.out.println(ts2);
		
	
		
	}

}
