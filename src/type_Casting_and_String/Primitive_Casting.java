package type_Casting_and_String;

public class Primitive_Casting {

	public static void main(String[] args) {
		int a = 10; // size=4byte
		System.out.println("Original value of A = " + a);
		double b = a;// casting size=8 byte
		System.out.println("After Casting Value of B = " + b);
		double c = 100.22;// size=8 byte
		System.out.println("Original value of C = " + c);
		int d = (int) c;// size=4byte
		System.out.println("After Casting value of D = " + d);
		float e = 10.22f;
		System.out.println("Original Value of E = " + e);
		int f = (int) e;
		System.out.println("After Casting Value of F = " + f);
	}

}
