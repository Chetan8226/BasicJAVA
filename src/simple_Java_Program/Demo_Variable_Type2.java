package simple_Java_Program;

public class Demo_Variable_Type2 {
	static int a = 10;

	public static void chow() {
		int b = 20;
		System.out.println("Value of B =" + b);
	}// method definition or static method

	public static void main(String[] args) {
		System.out.println("Value of A =" + a);
		chow(); // method calling
	}

}
