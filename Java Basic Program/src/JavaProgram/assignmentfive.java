package JavaProgram;

import java.util.Scanner;

public class assignmentfive {

	public static void main(String args[])
	{
		//Find out what is avarage of person 
		//enter age of 10 person and store in array
		
		int arrayone[]=new int[10];
		int avg=0;
		int result;
		
		Scanner sc = new Scanner(System.in);
		for(int a=0; a<10;a++)
		{
			System.out.println("Enter the user age"  +a);
			arrayone[a]= sc.nextInt();
			avg = avg+arrayone[a];
			
			
		}
		result = avg/10;
		System.out.println("Avarage of user age "  +result);
		
	}
}
