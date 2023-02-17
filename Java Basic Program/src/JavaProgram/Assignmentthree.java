package JavaProgram;

public class Assignmentthree {
     
	public static void main(String args[])
	{
		//Java Program to Check a Leap Year
		
		//A leap year is exactly divisible by 4 except for century years (years ending with 00). 
		//The century year is a leap year only if it is perfectly divisible by 400.
		
		int year=1996;
		
		if (year % 4 == 0)
		{
			System.out.println( year+ " is Leap Year");
		}
		else
		{
			System.out.println( year+ " is not Leap Year");
		}
		
	}
}
