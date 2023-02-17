package JavaProgram;

import java.util.Scanner;

public class Assignmentsix {

	public static void main(String args[])
   {
	 //Enter 10 name of your employee and also the age of your employee
		//save them in array ,check if the age is prime no.
	// if it is prime number then print the name of employee
		Scanner sc = new Scanner(System.in);
	    String namearray [] =new String[5];
		int arrayage[]=new int[5];
		int age;
		int count;
		for(int a=0; a<5;a++)
		{
			System.out.println("Enter the User Name "  +a);
			namearray[a] = sc.next();
			System.out.println("Enter the user age"  +a);
			arrayage[a]=sc.nextInt();
			
	}
		for(int b=0;b<5;b++)
		{
			count=0;
			age=arrayage[b];
			for(int x=2; x<=(age-1);x++)
			{
			     if(age % 2 == 0)
		     	{
				count=count+1;
						break;
			   }
			   
		}
			 if(count ==0)
			   {
				System.out.println("Prime number user name "  +namearray[b]);
			  }
			    else
			    {
			    	System.out.println("number is odd");
			    }
	}
		
   }
}