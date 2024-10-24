package simple_Java_Program;

public class Else_If_Statement 
  {

	public static void main(String[] args) 
	{
		int marks=65;
		if(marks>=35 && marks<=60)//condition1 && condition2 (&&=operator) (AND=both condition true , OR=at least one condition true)
		{
			System.out.println("Student is Pass in Second Class");// 30>=35&& 30>60
		}
		else if(marks>=60 && marks<=75)
		{
			System.out.println("Student Pass in First Class");
		}
		else if(marks>=75 && marks<=90)
		{
			System.out.println("Student is Pass in Distinction");
		}
		else if(marks>=90 && marks<=100)
		{
			System.out.println("Student is Pass in Merit");
		}
		else if(marks>=100)
		{
			System.out.println("Invalid Input, Please enter the correct marks");
		}
		else
		{
			System.out.println("Student is Fail in JAVA");
		}
	}
	
  }
