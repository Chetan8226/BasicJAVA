package Methods;

public class Non_Static_WithPara_SameClass {
	public void display(String name) {
		System.out.println("Name = " + name);
	}

	public static void main(String[] args) {
		Non_Static_WithPara_SameClass obj = new Non_Static_WithPara_SameClass();
		obj.display("Chetan");
	}
}