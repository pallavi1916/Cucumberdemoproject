package Java;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String args[])
	{
		// a palindrome number is a number that remain the same when its digits are reversed like 16461
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		int num=a;
		int rev=0;
		while(a!=0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		if(num==rev)
		{
			System.out.println("Number is Palindrome " );
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		//System.out.println(rev);
	}
}
