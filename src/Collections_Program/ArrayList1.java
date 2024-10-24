package Collections_Program;
import java.security.AllPermission;
import java.util.ArrayList;
public class ArrayList1 
  {

	public static void main(String[] args) 
	{
		ArrayList al1=new ArrayList();//default capacity = 10
		ArrayList al2=new ArrayList(1000);//1000
		ArrayList al3=new ArrayList(al2);//1000
		System.out.println("Sizw of al1 = " + al1.size());
		System.out.println("All is Empty or Not = " + al1.isEmpty());
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(70);
		System.out.println(al1);
		System.out.println("Sizw of al1 = " + al1.size());
		System.out.println("All is Empty or Not = " + al1.isEmpty());
		al1.add(2,40);
		System.out.println("Adding One Element by Index = " + al1);
		al1.add("Harry");
		System.out.println("After Adding String Element = " +al1);
		al1.remove(2);
		System.out.println("After Removing Element By Index = " + al1);
		System.out.println("Al1 contain Harry? = " + al1.contains("Harry"));
		al1.add(null);
		System.out.println("After Adding null element = " + al1);
		al1.add(70);
		System.out.println("After Adding Duplicate Value = " + al1);
	}
  }
