package JavaProgram;

import java.util.Scanner;

public class arraywithaddition {

	public static void main(String args[])
	{
		//Create an array of size 5, enter the value from user and add all the present value
		int addarray=0;
		int arrayone [] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int a = 0; a<5; a++)
		{
			System.out.println("Enter The Value" +a);
			
			arrayone[a] = sc.nextInt();
			
			
		}
		
		for(int b=0 ; b<5; b++)
		{
			
			
		   addarray = addarray + arrayone[b]; // for addition of array value
			
		}
		
		System.out.println("Addition of Array is : " +addarray);
	}
}
