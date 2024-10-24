package Methods;

public class Non_Static_ReturnType_SameClass 
  {
	public int add()
	{
		return 10+20;
	}

	public static void main(String[] args) 
	{
		Non_Static_ReturnType_SameClass obj=new Non_Static_ReturnType_SameClass();
		 int output = obj.add();
		System.out.println("Addition of Two Numer="+ output);
	}
  }