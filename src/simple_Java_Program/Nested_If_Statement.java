package simple_Java_Program;

public class Nested_If_Statement {

	public static void main(String[] args) {
		String username = "Chetan";
		String password = "Admin@123";
		if (username == "Chetan") {
			if (password == "Admin@123") {
				System.out.println("Login Sucessful");
			} else {
				System.out.println("Password is Incorrect");
			}
		} else {
			System.out.println("UserName is Incorrect");
		}

	}

}
