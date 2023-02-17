package JavaProgram;

import java.util.Scanner;

public class higestnumber {
       
	public static void main(String args[])
	{
		// take 10 values from user and check which is highest value
		
		int userinput[]=new int[10];
		Scanner sc = new Scanner(System.in);
		int result=0;
		for(int a=0;a<10;a++)
		{
			System.out.println("Enter the Values "  +a);
			userinput[a]=sc.nextInt();
			if(result>=userinput[a])
			{
				result=result;
			}
			else
			{
				result=userinput[a];
			}
		}
		
		System.out.println("The Highest Number is "  +result);
		
	}
}
