package JavaProgram;

import java.util.Scanner;

public class oddevenwithadditionmultipl {

	 public static void main(String args[])
	 
	 {
		 //enter two value from user .add them and check if it is even or add ,
		 //if it is even then multiply the values,else subtract the values
		 
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the First number");
		  int a = sc.nextInt();
		  System.out.println("Enter the Second number");
		  int b = sc.nextInt();
		  int result = a+b;
		  if(result % 2 ==0)
		  {
			  System.out.println("Number is even" + a*b);
		  }
		  else
		  {
			  System.out.println("Number is Odd" +(a-b));
		  }
		  
		 
	 }
}
