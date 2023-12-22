package Collections_Program;

import java.util.Vector;

public class Vector1 
{

	public static void main(String[] args) 
	{
		Vector v1=new Vector();//default capacity = 10
		Vector v2=new Vector(1000);//1000
		Vector v3=new Vector(v2);//1000
		Vector v4=new Vector();
		for(int i=0;i<5;i++)
		{
			v1.add(i);
		}
		System.out.println(v1);
		System.out.println(v1.capacity());
		v1.add(12);
		System.out.println(v1);
		System.out.println(v1.capacity());
		v1.addElement(13);
		System.out.println(v1);
		System.out.println(v1.capacity());
		for(int i=0;i<10;i++)
		{
			v1.add(i);
		}
		System.out.println(v1);
		System.out.println(v1.capacity());
		System.out.println(v1.indexOf(12));
		System.out.println(v1.lastElement());
		System.out.println(v1.firstElement());
		v1.setElementAt(999,1);
		System.out.println(v1);
		
	
	}

}
