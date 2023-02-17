package program;

import java.util.Scanner;

public class Palindomr_String {

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		String str =sc.next();
		String a = str;
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		if(a.equals(rev))
		{
			System.out.println("String is Palindrome : "+rev);
		}
		else
		{
			System.out.println("String is  not Palindrome : "+rev);
		}
	}
}
