package Methods;

public class Static_With_Para_SameClass {
	public static void chow1() {
		int a = 200, b = 300, sum;
		sum = a + b;
		System.out.println("Addition of A & B=" + sum);
	}// non parameterized

	public static void chow2(int a) {
		int sum;
		sum = a + a;
		System.out.println("Addition of A & A=" + sum);
	}// parameterized

	public static void chow3(int a, int b) {
		int sum = a + b;
		System.out.println("Addition of A & B=" + sum);
	}

	public static void chow4(int a, int b) {
		int sub = a - b;
		System.out.println("Subatractin of A & B=" + sub);
	}

	public static void chow5(int a, int b, int c) {
		int mul = a * b * c;
		System.out.println("Multiplication of A,B & C=" + mul);
	}

	public static void main(String[] args) {
		System.out.println("This is Main Method");
		chow1();
		chow2(200);
		chow3(10, 20);
		chow4(10, 20);
		chow5(10, 20, 30);
	}

}
