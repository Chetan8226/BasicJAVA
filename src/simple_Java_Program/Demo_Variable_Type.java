package simple_Java_Program;

public class Demo_Variable_Type 
  {
	static int a=10;//global variable
	static int b=20;//global variable

	public static void main(String[] args) 
	{
		int c=30;//local variable  * Local Variable also called as temporary variable.
		System.out.println("Value of C =" + c);
		System.out.println("Value of A =" + a);
		System.out.println("Value of B =" + b);
		c=300;
		a=100;
		b=200;
		System.out.println("New Value of C =" + c);
		System.out.println("New Value of A =" + a);
		System.out.println("New Value of B =" + b);
	}

  }
