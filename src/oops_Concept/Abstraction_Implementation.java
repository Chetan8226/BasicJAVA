package oops_Concept;

public class Abstraction_Implementation 
  {

	public static void main(String[] args) 
	{
		//Abstraction obj=new Abstraction();//abstract class (cna't create object )
		Abstraction_Child_Class obj=new Abstraction_Child_Class();
		obj.show1();//own method
		obj.chow();//abstract class method
		obj.display();//abstract class method
	}
  }
