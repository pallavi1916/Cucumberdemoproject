package JavaProgram;

import java.util.Scanner;

public class forloopwithstrin {
        
	public static void main(String args[])
	{
		// Enter Name ,age,place from user
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String place;
		
		for (int a= 1; a<4; a++)
		{
			System.out.println("Enter Your"  +a+  "Name");
			name=sc.next();
			System.out.println("Enter Your"  +a+  "Age");
			age=sc.nextInt();
			System.out.println("Enter Your"  +a+  "Place");
			place=sc.next();
			
			System.out.println("Your name is " +name +age +place);
			
		}
		
	}
}
