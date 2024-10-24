package array_Program;

public class Exception3 
  {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
			String str=null;
			System.out.println(str.toUpperCase());
			System.out.println("Print");
		}
		catch(NullPointerException ne)
		{
			System.out.println("Can not perform operation " + ne);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Cannot Divide by Zero");
		}
		catch(Exception ee)
		{
			System.out.println("Generalize Handeling");
		}
	}
  }
