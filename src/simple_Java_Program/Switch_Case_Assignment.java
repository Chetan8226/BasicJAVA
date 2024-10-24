package simple_Java_Program;

public class Switch_Case_Assignment 
  {
	public static void main(String[] args) 
	{
		int a=10,b=20;
		char operation='+';
				switch(operation)
				{
				case'+':
					System.out.println("Addition="+(a+b));
					break;
				case'-':
					System.out.println("Substraction="+(a-b));
					break;
				case'*':
					System.out.println("Multiply="+(b*a));
					break;
				default:
					System.out.println("Wrong operation");			
				}
	}
  }
