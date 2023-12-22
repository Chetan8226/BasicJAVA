package oops_Concept;

public class Polymorphism 
  {
	public void add() 
	{
		System.out.println("Addition of Two Numbers= " + (10 + 20));

	}

	public void add(int a) 
	{
		System.out.println("Addition of A & A=" + (a + a));

	}

	public void add(int a, int b) 
	{
		System.out.println("Addition of A & B=" + (a + b));
	}

	public void add(double a) 
	{
		System.out.println("Addition of Double A=" + (a + a));
	}

	public void add(int a, int b, int c) 
	{
		System.out.println("Additiom of A,B & C=" + (a + b + c));
	}
//method overload= 1 class= method= same name + different parameter
//method override= 2 class method= same name + same parameter 	
  }
