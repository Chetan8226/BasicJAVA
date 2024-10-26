package oops_Concept;

public class Encapsulation {
	private double sal;

	public void set(double salary) {
		sal = salary;
	}

	public double get() {
		return sal;
	}

	public void display() {
		System.out.println("Salary = " + sal);
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.sal = 55000.02;
		obj.set(55000.02);
		System.out.println(obj.get());
		obj.display();
	}
}
