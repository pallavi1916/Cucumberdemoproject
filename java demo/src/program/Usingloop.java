package program;

import java.util.Scanner;

public class Usingloop {

	public static void main(String args[])
	{
		//take 10 values from user
		//use For Loop
		//Check if the number is even or odd ,add all the even number and add all odd number
		
		Scanner sc= new Scanner(System.in);
		int evenno=0;
		int oddno=0;
		for (int i=0;i<=10;i++)
		{
			System.out.println("Enter The Number" +i);
			
			int num = sc.nextInt();
			if(num %2 ==0)
			{
				evenno=evenno + num;
			}
			else
			{
				oddno=oddno + num;
			}
			
		}
		System.out.println("additon od Even No " +evenno);
		System.out.println("additon od Odd No " +oddno);		
	}
}
