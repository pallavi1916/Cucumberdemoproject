package JavaProgram;

import java.util.Scanner;

public class Assignmentfour {

	public static void main(String args[])
	{
		// Enter 10 values from user and store it in array
		//check value is odd and even , add odd and even number and display the result
		
		int arrayone[] = new int[10];
		int evenarray=0;
		int oddarray = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int a=0;a<10;a++)
		{
			System.out.println("Enter the Value "  +a);
			arrayone[a]=sc.nextInt();
			
			if(arrayone[a] % 2 ==0)
			{
				evenarray=evenarray+arrayone[a];
			}
			else
			{
				oddarray=oddarray+arrayone[a];
			}
		}
		
		System.out.println("Addition of even Number "  +evenarray);
		System.out.println("Addition of even Number "  +oddarray);
	}
}
