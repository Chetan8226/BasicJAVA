package simple_Java_Program;

public class Demo_Variable_Type3 
  {
	static int a=10;//11//12
	int b=20;//20//20
	public void chow()
	{
		a++;//10->11->12->13
		b++;//20->21
		System.out.println(a+"-----"+b);
	}
	public static void main(String[] args) 
	{
		Demo_Variable_Type3 che=new Demo_Variable_Type3();//object creation
		//class_name object=new class_name();
		che.chow();
		Demo_Variable_Type3 che1=new Demo_Variable_Type3();
		che1.chow();
		Demo_Variable_Type3 che2=new Demo_Variable_Type3();
		che2.chow();

	}

  }
