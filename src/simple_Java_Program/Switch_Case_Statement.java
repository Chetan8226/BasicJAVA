package simple_Java_Program;

public class Switch_Case_Statement {
	public static void main(String[] args) {
		String day = "Thuresday";
		switch (day) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		case "Thuresday":
			System.out.println("Today is Thuresday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Its Weekend");
		}
	}
}
