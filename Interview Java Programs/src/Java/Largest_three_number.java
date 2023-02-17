package Java;

import java.util.Scanner;

public class Largest_three_number {

	public static void main(String[] args) {
		// find Largest number
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter Third number");
		int c=sc.nextInt();
		
		//logic 1
//		if(a>b && a>c)
//		{
//			System.out.println(a+ "Largest Number");
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println(b+ "Largest Number");
//		}
//		else
//		{
//			System.out.println(c+ "Largest Number");
//		}
		
		//logic 2 -ternary operater in java-
		int largest = a>b?a:b; //largest of a & b
		int largest1=c>largest?c:largest;//largest of c & largest
		//int largest2=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest1+ " is Largest Number");

	}

}
