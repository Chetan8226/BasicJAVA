package oops_Concept;

public class Interface_Child_3_Assignment_3 implements Interface_Assignment_3
{
	public void home3()
	{
		System.out.println("Child3 Have a Home3");
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
