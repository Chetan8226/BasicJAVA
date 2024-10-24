package array_Program;

public class Exception2 
  {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Division = " + (10/0));
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Can't Divide by Zero = " + ae);
		}
		try
		{
			String Str=null;
			System.out.println(Str.toUpperCase());
		}
		catch(Exception e)
		{
			System.out.println("Can not perform the operation" + e);
		}
	}
  }
