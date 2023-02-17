package program;

import java.util.Scanner;

public class tables {

	public static void main(String args[])
	{
		//take a number from user and print multiplication table
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a = sc.nextInt();
		int result=0;
		for(int i =1; i<=10; i++)
		{
			result= a*i;
			System.out.println("Multiplication table of =" +result);
		}
	}
}
