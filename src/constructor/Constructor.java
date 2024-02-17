package constructor;

public class Constructor 
  {
	int a;
	int b;
	public Constructor()
	{
		a=10;
		b=20;
		System.out.println("This is constructor");
		
	}//zero parameter constructor
	public void display()
	{
		System.out.println("Value of a "+ a);
		System.out.println("Value of B "+ b);
		
	}
	public static void main(String[] args) 
	{
		Constructor obj=new Constructor();
		obj.display();
	}

  }
