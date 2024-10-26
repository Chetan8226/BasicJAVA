package oops_Concept;

public class Interface_Child_Assignment_1 implements Interface_Assignment_1 {
	public void bycycle() {
		System.out.println("Child Have a Bycycle");
	}

	@Override
	public void Home() {
		System.out.println("Parent Have a Home");
	}

	@Override
	public void Car() {
		System.out.println("Parent Have a Car");
	}

	@Override
	public void land() {
		System.out.println("Parent have a land");
	}
}
