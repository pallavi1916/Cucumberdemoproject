package JavaProgram;

import java.util.Scanner;

public class oddevennumber {
	
	public static void main(String args[])
	
	{
		//Enter any input from user and check if the value is odd or even
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		
		if (a % 2 == 0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
