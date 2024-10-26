package simple_Java_Program;

public class Nested_If_Assignment {

	public static void main(String[] args) {
		String pin = "1234";
		double amountInAcc = 1000;
		double amountToWithdrawl = 500;

		if (pin == "1234") {
			if (amountToWithdrawl <= amountInAcc) {
				System.out.println("We can Debit the Cash");
			} else {
				System.out.println("Insufficient Amount");
			}
		} else {
			System.out.println("Incorrect Pim");
		}

	}

}
