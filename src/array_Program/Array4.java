package array_Program;

public class Array4 
  {

	public static void main(String[] args) 
	{
		String name[][]=new String[2][2];
		name[0][0]="Harry";
		name[0][1]="Jerry";
		name[1][0]="Tom";
		name[1][1]="Potter";
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(name[i][j]+ "\t");//cut ln   ("\t") is for new line(for space)
			}
			System.out.println();
		}
	
	}

  }
