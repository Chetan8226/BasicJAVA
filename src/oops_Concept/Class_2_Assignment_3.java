package oops_Concept;

public class Class_2_Assignment_3 implements Interface_Assignment_3
{
	public void home2()
	{
		System.out.println("Child2 Have a Home2");
	}

	@Override
	public void home() {
		System.out.println("Parent Have a Home");
	}

	@Override
	public void car() {
		System.out.println("Parent Have a Car");
	}

	@Override
	public void land() {
		System.out.println("Parent Have a Land");
	}

}
