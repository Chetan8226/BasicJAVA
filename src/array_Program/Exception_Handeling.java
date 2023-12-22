package array_Program;

public class Exception_Handeling 
{

	public static void main(String[] args) 
	{
		System.out.println("Main Method Started");
		int a=10,b=0,c;
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception ae)
		{
			System.out.println("Exception is Handled " + ae);
			
		}
		System.out.println("Main Method Ended");

	}

}
