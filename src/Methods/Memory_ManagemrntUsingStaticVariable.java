package Methods;

public class Memory_ManagemrntUsingStaticVariable 
  {
	static int a=0;
	int b=0;
	public void add()
	{
		a++;
		b++;
		System.out.println(a + "-----" + b);
		System.out.println("Value of A = " + a);
		System.out.println("Value of B = " + b);
	}

	public static void main(String[] args) 
	{
		Memory_ManagemrntUsingStaticVariable obj=new Memory_ManagemrntUsingStaticVariable();
		obj.add();
		Memory_ManagemrntUsingStaticVariable obj1=new Memory_ManagemrntUsingStaticVariable();
		obj1.add();
		Memory_ManagemrntUsingStaticVariable obj2=new Memory_ManagemrntUsingStaticVariable();
		obj2.add();		
		Memory_ManagemrntUsingStaticVariable obj4=new Memory_ManagemrntUsingStaticVariable();
		obj4.add();
		
	}

  }
