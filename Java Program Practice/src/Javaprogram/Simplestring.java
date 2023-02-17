package Javaprogram;

public class Simplestring {
	public static void main(String[] args)
	{
		String str = "ABCD";
		String str1 ="";
		int len=str.length();
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
		{
			str1=str1+a[i];
		}
		System.out.println(str1);
	}

}
