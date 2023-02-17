package program;

import java.util.Scanner;

public class Ifelse {

	public static void main(String args[])
	{
		//Enter Two values from user and add them and store in result variable and check if result is greater than 100.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		int result = a+b;
		
		if(result >100)
		{
			System.out.println("Result Is Greater than 100");
		}
		else
		{
			System.out.println("Result Is Less than 100");
		}
	}
}
