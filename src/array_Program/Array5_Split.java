package array_Program;

public class Array5_Split 
{

	public static void main(String[] args) 
	{
		String sc="I Am Chetan";
		String date="02-11-2023";
		String splitsc[]=sc.split("");
		System.out.println("Original String = " + sc);
		System.out.println("After Split");
		for(int i=0;i<splitsc.length;i++)
		{
			System.out.println(splitsc[i]);			
		}
		System.out.println("***************");
		String splitdate[]=date.split("-");
		System.out.println("Original Date = " + date);
		System.out.println("After Split");
		for(int i=0;i<splitdate.length;i++)
		{
			System.out.println(splitdate[i]);
		}

	}

}
