package Methods;

public class Non_Static_Same_Class {
	public void show() {
		int a = 10, b = 20, sum;
		sum = a + b;
		System.out.println("Addition of A & B=" + sum);
	}// non static method

	public static void main(String[] args) {
		System.out.println("This is main method");
		// class_Name object_name=new class name();
		// object_name(anything you want)
		Non_Static_Same_Class obj = new Non_Static_Same_Class();
		obj.show();
	}
}