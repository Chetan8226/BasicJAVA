package oops_Concept;

public class Class_1_Assignment_3 implements Interface_Assignment_3
{
	public void home1()
	{
		System.out.println("Child1 Have a Home1");
	}

	@Override
	public void home() 
	{
		System.out.println("Parent Have a Home");
	}

	@Override
	public void car() 
	{
		System.out.println("Parent Have a Car");
	}

	@Override
	public void land() 
	{
		System.out.println("Parent Have a Land");
	}

}
