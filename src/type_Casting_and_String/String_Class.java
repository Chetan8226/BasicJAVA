package type_Casting_and_String;

public class String_Class 
  {

	public static void main(String[] args) 
	{
		String str1;
		str1="Chetan";
		String str2="Nannaware";
		String str3=new String("CHETAN");
		String str4=new String("NANNAWARE");
		String str5=str1.concat(str4);
		String str6="";
		String sc="India is My Country";
		System.out.println(str1);//1
		System.out.println(str2);//2
		System.out.println(str3);//3
		System.out.println(str4);//4
		System.out.println(str5);//5
		System.out.println(str1.isEmpty());//6
		System.out.println(str6.isEmpty());//7
		System.out.println(str1.equals(str3));//8//in equal case capital/small can't be ignore
		System.out.println(str1.equalsIgnoreCase(str3));//9//in equal ignore case capital/small can be ignore
		System.out.println(str1.length());//10
		System.out.println(str2.length());//11
		System.out.println(str1.toUpperCase());//12
		System.out.println(str4.toLowerCase());//13
		System.out.println(sc.length());//14
		System.out.println(sc.indexOf('i'));//15
		System.out.println(sc.startsWith("India i"));//16
		System.out.println(sc.endsWith("Country"));//17
		System.out.println(str2.charAt(2));//18
		System.out.println(sc.replace("My","Was"));//19	
	}
  }
