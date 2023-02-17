package JavaProgram;

import java.util.Scanner;

public class elsecondition {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b = sc.nextInt();
		int result = a+b;
		
		if(result > 100)
		{
			System.out.println("Result is greater than 100 : " +result );
		}
		else
		{
			System.out.println("Result is less than 100");
		}
	}

}
