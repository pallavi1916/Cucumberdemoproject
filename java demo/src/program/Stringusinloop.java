package program;

import java.util.Scanner;

public class Stringusinloop {

	public static void main(String args[])
	{
		//enter the information for three user -name,age,place using loop
		
		Scanner sc = new Scanner(System.in);
		String name = null;
		int age = 0;
		String place = null;
		for(int i=1; i<4; i++)
		{
			System.out.println("Enter the user Name " +i+ " Name" );
			
			 name = sc.next();
			
			System.out.println("Enter the user age " +i+ " age");
			 
			 age = sc.nextInt();
			
			System.out.println("Enter the user place " +i+ " place");
			
			 place = sc.next();
			
		}
		
		System.out.println("User name is " +name +age +place);
	}
	
}
