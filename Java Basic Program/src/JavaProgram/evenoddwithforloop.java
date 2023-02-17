package JavaProgram;

import java.util.Scanner;

public class evenoddwithforloop {
 
	public static void main(String args[])
	{
		//Enter the value from user
		//use for loop
		//check if number even or odd
		//add all even  number and add all odd number
		
		Scanner sc = new Scanner(System.in);
		int userinput;
		int evennumber = 0;
		int oddnumber=0;
		
		for(int abc=1; abc<11; abc++)
		{
			System.out.println("Enter the number");
			userinput= sc.nextInt();
			
			if(userinput %2 ==0)
			{
				evennumber = userinput + evennumber;
			}
			
			else
			{
				oddnumber = userinput + oddnumber;
				
			}
			
		}
		
		System.out.println("Total of Even Number : " +evennumber);
		System.out.println("Total of Odd Number : " +oddnumber);
		
	}
}
