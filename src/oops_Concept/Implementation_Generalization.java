package oops_Concept;

public class Implementation_Generalization 
{

	public static void main(String[] args) 
	{
		Generalization_Child_1 obj2=new Generalization_Child_1();
		System.out.println("Child1");
		obj2.home();
		obj2.car();
		obj2.land();
		Generalization_Child_2 obj1=new Generalization_Child_2();
		System.out.println("Child2");
		obj1.home();
		obj1.car();
		obj1.land();
		Generalization_Child_3 obj=new Generalization_Child_3();
		System.out.println("Child3");
		obj.home();
		obj.car();
		obj.land();		
	}

}
