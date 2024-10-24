package array_Program;

public class Array1 
  {
	public static void main(String[] args) 
	{
		int marks[]= {1,2,3,4,5,6,7,8};//array declaration
		           //[0],[1],[2],[3]...,[9]
		System.out.println("Length of array = " + marks.length);
		System.out.println("Second Element = " + marks[1]);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		int marks1[]=new int[10];//array declaration
		marks1[0]=19;
		marks1[1]=20;
		marks1[2]=21;
		marks1[3]=22;
		marks1[4]=23;
		System.out.println("Seconr Element = " + marks1[1]);
	}
  }