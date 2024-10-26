package Methods;

public class Static_Method_Calls_From_Same_Class {
	public static void chow() // When we used void in method declaration, method cannot return any value.
	{
		System.out.println("This is Static Method");
	}// user define static method definition

	public static void main(String[] args) {
		System.out.println("This is Main Method");
		chow();// calling of method
	}
}