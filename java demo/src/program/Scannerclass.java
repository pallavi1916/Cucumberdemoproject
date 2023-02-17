package program;

import java.util.Scanner;

public class Scannerclass {

	public static void main(String args[])
	{
		//print the sum of  N naturals number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	int a = sc.nextInt();
	int result = 0;
	for(int i = 0; i<=a; i++)
	{
		result= result+i; // 0+1=1, 1+2=3,3+3=6,6+4=10
	}
	
		System.out.println(result);
	}
}
