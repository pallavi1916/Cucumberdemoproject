package JavaProgram;

import java.util.Scanner;

public class conditionstatementsccanerclass {
	
	public static void main(String args[])
	{
		//using scanner class for user enter the value manually
		
		Scanner sc = new Scanner(System.in); //create object of scanner class
		
		System.out.println("Enter value of abc : ");
		
		 int  abc = sc.nextInt(); // variable declaration 
		 
		 if (abc>20)
		 {
			 System.out.println("abc is greater than 20");
		 }
		 else
		 {
			 System.out.println("abc is less than 20");
		 }
		 
		 System.out.println("ABC is = " +abc);
		
	}

}
