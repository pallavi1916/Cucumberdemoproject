package JavaProgram;

import java.util.Scanner;

public class Arraybasicprogram {
              
	public static void main(String args[])
	{
		//Define an array of size and enter the value in that array by user
		int arraydemo [] = new int[10]; //define array and intilize the value of array
		
		Scanner sc = new Scanner(System.in);
		
		for(int a=0; a<10;a++)
		{
			System.out.println("Enter the value");
			arraydemo[a] = sc.nextInt();
		}
		
		for(int b=0; b<10; b++)
		{
		    System.out.println("Array List is :  "  +arraydemo[b]);
	    }
	}
}
