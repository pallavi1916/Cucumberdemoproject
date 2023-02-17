package program;

import java.util.Scanner;

public class forloop {

	public static void main(String args[])
	{
		
		//for(int a = 10; a<=100; a=a+5)
		//{
			//System.out.println(a);
		//}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number= sc.nextInt();
		for(int a = 0; a<number; a = a+5)
		{
			
	
			System.out.println(a);
		}
	}
}
