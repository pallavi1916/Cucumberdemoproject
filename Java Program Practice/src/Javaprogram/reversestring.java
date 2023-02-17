package Javaprogram;

public class reversestring {
	public static void main(String[] args)
	{
		String str="The Java Program";
		String rev = "";
		int len=str.length();
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--)
			
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
	}

}
