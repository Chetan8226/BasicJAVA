package Methods;

public class Static_Method_From_Para_From_Diff_Class_Assignment {
	public static void mul1(int a, double b) {
		System.out.println("MUL=" + (a * b));
	}

	public static void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of Two Number=" + sum);
	}

	public static void sub(int c, int d) {
		System.out.println("Substraction=" + (c - d));
	}

	public static void mul(int a, int b, int c) {
		System.out.println("Multiplication=" + (a - b - c));
	}

	public static void main(String[] args) {
		add(10, 20);
		sub(1000, 20);
		mul(9, 99, 999);
		mul1(10, 111.111);

	}

}
