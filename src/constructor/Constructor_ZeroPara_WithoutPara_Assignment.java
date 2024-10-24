package constructor;

public class Constructor_ZeroPara_WithoutPara_Assignment 
  {
	int a;
	int b;
	public Constructor_ZeroPara_WithoutPara_Assignment()
	{
		a=100;
		b=200;
		System.out.println("This is Zero Para Constructor");
	}
	public void display()
	{
		System.out.println("Value of A=" + a);
		System.out.println("Value of B=" + b);
	}
	public Constructor_ZeroPara_WithoutPara_Assignment(int c)
	{
		System.out.println("This is With Para Constructor");
		System.out.println("Value of C=" + c);
	}

	public static void main(String[] args) 
	{
		Constructor_ZeroPara_WithoutPara_Assignment obj=new Constructor_ZeroPara_WithoutPara_Assignment();
		obj.display();
		Constructor_ZeroPara_WithoutPara_Assignment obj1=new Constructor_ZeroPara_WithoutPara_Assignment(300);
	}
  }