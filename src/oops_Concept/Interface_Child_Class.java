package oops_Concept;

import java.util.Scanner;

public class Interface_Child_Class implements Interface
  {
	String name;
	int age,id;
	double salary;

	@Override
	public void getEmpDetails() 
	{
		/*name="Chetan";
		id=8226;
		age=28;
		salary=5500.02;*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the name, id, age, salary of the Employe");
		name=sc.next();
		id=sc.nextInt();
		age=sc.nextInt();
		salary=sc.nextDouble();
	}

	@Override
	public void chowEmpDetails() 
	{
		System.out.println("Name of Employe=" + name);
		System.out.println("ID of Employe=" + id);
		System.out.println("Age of Employe=" + age);
		System.out.println("Salary of Employe=" + salary);
		
	}
	

  }
