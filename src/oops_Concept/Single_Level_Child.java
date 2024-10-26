package oops_Concept;

public class Single_Level_Child extends Single_Level_Parent {
	public void bike() {
		System.out.println("Child Have Bike");
	}

	public static void main(String[] args) {
		Single_Level_Child obj = new Single_Level_Child();
		obj.bike();
		obj.car();
		obj.home();
	}
}