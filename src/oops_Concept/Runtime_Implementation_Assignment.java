package oops_Concept;

public class Runtime_Implementation_Assignment 
  {

	public static void main(String[] args) 
	{
		Runtime_Child_Assignment obj = new Runtime_Child_Assignment();
		obj.bankname();
		obj.rate();
		RunTime_Parent_Assignment obj1 = new RunTime_Parent_Assignment();
		obj1.bankname();
		obj1.rate();
		RunTime_Parent_Assignment obj2 = new Runtime_Child_Assignment();
		obj2.bankname();
		obj2.rate();
	}
  }
