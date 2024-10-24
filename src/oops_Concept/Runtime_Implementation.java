package oops_Concept;

public class Runtime_Implementation 
  {

	public static void main(String[] args) 
	{
		Runtime_Child obj = new Runtime_Child();
		obj.employee();
		Runtime_Parent obj1 = new Runtime_Parent();
		obj1.employee();
		Runtime_Parent obj2 = new Runtime_Child();// casting
		obj2.employee();
	}
  }
