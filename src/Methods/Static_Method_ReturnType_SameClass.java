package Methods;

public class Static_Method_ReturnType_SameClass {
	public static int show() {
		int a = 10, b = 20, mul;
		mul = a * b;
		return mul;
	}

	public static void main(String[] args) {
		System.out.println("This is Main Method");
		int out = show();
		System.out.println("Multiplication of A & B=" + out);
	}
}
