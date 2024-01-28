package type_Casting_and_String;

public class Implementation_Non_Primitive_Or_Class_Casting 
  {

	public static void main(String[] args) 
	{
		//single level inheritance
		Non_Primitive_Or_Class_Casting_Child obj=new Non_Primitive_Or_Class_Casting_Child();
		obj.child();
		obj.parent();
		System.out.println("-------------------");
		//up casting
		//parent class obj=new child class();
		Non_Primitive_Or_Class_Casting_Parent obj1=new Non_Primitive_Or_Class_Casting_Child();
		obj1.parent();
		//only parent method can be used (child method can't be used )
		System.out.println("-------------------");
		//down casting
		//child class obj=new parent class
		Non_Primitive_Or_Class_Casting_Child obj2=(Non_Primitive_Or_Class_Casting_Child) new Non_Primitive_Or_Class_Casting_Parent();
		obj2.child();
		obj2.parent();
	}
  
  }
