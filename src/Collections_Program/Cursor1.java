package Collections_Program;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Cursor1 
{

	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		for(int i=0;i<10;i++)
		{
			v1.add(i);
			
		}
		System.out.println(v1);
		// Enumeration Cursor
		/*System.out.println("Enumeration Cursor");
		Enumeration e=v1.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		// Iterator Cursor
		System.out.println("Iterator Cursor");
		Iterator itr=v1.iterator();
		while(itr.hasNext())
		{
			int num=(int) itr.next();
			if(num%2==0)
			{
				System.out.println(num);
			}
			else
			{
				itr.remove();
			}
		}
		System.out.println(v1);*/
		// List Iterator Cursor
		System.out.println("List Iterator Cursor");
		ListIterator ltr=v1.listIterator();
		while(ltr.hasNext())
		{
			int num1=(int) ltr.next();
			if(num1==5)
			{
				ltr.remove();
			}
			else if(num1==2)
			{
				ltr.add(22);
			}
			else if (num1==3)
			{
				ltr.add(33);
			}
			
		}
		System.out.println(v1);
	}

}
