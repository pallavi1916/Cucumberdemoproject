package JavaProgram;

import java.util.Scanner;

public class elseifageprogram {
     
	public static void main(String args [])
	{
		//Enter age of the person
		   //if age is less than18 then discount is 10%
		   //if age is greater than 18 and less than 45 then no discount
		   //if age is greater than45 and less than 60 then discount is 20%
		   //if age is greater than 60 then they will get 40% discount
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if(age < 18)
		{
			System.out.println("You get 10 % Discount");
		}
		
		else if(age > 18 && age < 45)
		{
			System.out.println("Sorry You did not get any Discount");
			
		}
		
		else if(age >45 && age < 60)
		{
			System.out.println(" You get 20 % Discount");
		}
		
		else if (age > 60 )
		{
			System.out.println("You get 40 % Discount");
		}
		
		else
		{
			System.out.println("This is the boundary value , Please do not enter the 18,45,60 values");
		}
	}
	
}
