package array_Program;

public class Exception1 {

	public static void main(String[] args) {
		try {
			System.out.println("Ststement 1 ");
			System.out.println("Ststement 2 " + (10 / 0));
			System.out.println("Ststement 3 ");
		} catch (Exception ae) {
			System.out.println("Statement 2 " + (10 / 0));
			System.out.println("Statement 4 ");

		} finally {
			System.out.println("Statement 5 ");
			System.out.println("Statement 2 = " + (10 / 0));
		}
		System.out.println("Statement 6 ");
	}
}
