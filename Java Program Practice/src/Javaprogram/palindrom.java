package Javaprogram;

public class palindrom {
	public static void main(String[]args)
	{
		String str="sum";
		String str1="";
		int l=str.length();
		char a[]=str.toCharArray();
		for(int i=l-1;i>=0;i--)
		{
			str1=str1+a[i];
		}
		if(str.equals(str1))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not plindrome");
		}
	}

}
