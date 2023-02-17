package program;

import java.util.Scanner;

public class Primenumber {

	public static void main(String args[])
	{
		//take any number and check number is prime or not
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number");
		 int no = sc.nextInt();
		  int count = 0;
		  for (int a=1; a<no-1;a++) 
		  {
			  if(no %2 ==0)
			  {
				  count= count+1;
				  break;
			  }
		  }
		  if(count ==0)
		  {
			  System.out.println("number is prime");
		  }
		
		  else
		  {
			  System.out.println("number is not prime");
		  }
	}
}
