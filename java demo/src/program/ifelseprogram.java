package program;

import java.util.Scanner;

public class ifelseprogram {
	
	public static void main(String args[])
	{
//		Enter age of the person
//		1. if age is less than 18 then discount is 10%
//		2.if age is greater than 18 and less than 45 then no disscount
//		3.if age is greater than 45 and less than 60 then 20% discount
//		4.if age is greater than 60 he will get 40% discount
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the user age");
		
		int age= sc.nextInt();
		
		if(age < 18)
		{
			System.out.println("Discount is 10%");
		}
		else if(age >18 && age<45)
		{
			System.out.println("There is No Discount");
		}
		else if(age >45 && age<60)
		{
			System.out.println("Discount is 20%");
		}
		else if(age>60)
		{
			System.out.println("Discount is 40%");
		}
		else
		{
			System.out.println("Not Eligible for Discount");
		}
		
	}

}
