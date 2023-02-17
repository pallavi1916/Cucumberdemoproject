package program;

import java.util.Scanner;

public class Palindrome_number {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		int a =num;
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		//System.out.println(rev);
		
		if(a==rev)
		{
			System.out.println("Number is Palindroome :" +rev);
		}
		else
		{
			System.out.println("Number is not Palindroome :" +rev);
		}
	}
}
