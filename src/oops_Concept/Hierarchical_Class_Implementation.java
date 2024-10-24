package oops_Concept;

public class Hierarchical_Class_Implementation 
  {

	public static void main(String[] args) 
	{
		Hierarchical_Class_Child1 obj1 = new Hierarchical_Class_Child1();
		obj1.bike();// own
		obj1.car();// parent
		obj1.home();// parent
		Hierarchical_Class_Child2 obj2 = new Hierarchical_Class_Child2();
		obj2.laptop();// own
		obj2.car();// parent
		obj2.home();// parent
		Hierarchical_Class_Child3 obj3 = new Hierarchical_Class_Child3();
		obj3.videoGame();// own
		obj3.car();// parent
		obj3.home();// parent
	}
  }