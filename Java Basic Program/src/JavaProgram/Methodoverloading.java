package JavaProgram;

import java.util.Scanner;

public class Methodoverloading {
      
	public static void main(String args[])
	{
		//take 2 from user in main function
		//create new user define function with return type as integer
		//compare this two number in user define function and print the result
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The First value");
		int a=sc.nextInt();
		System.out.println("Enter the second value");
		int b = sc.nextInt();
		Methodoverloading obj = new Methodoverloading();
		int abc = obj.compare(a,b);
		System.out.println(abc);
	}
	
	public int compare(int x,int y)
	{ 
		if(x>y)
		{
			return(x);
			
		}
		else if(x<y)
		{
			return(y);
		}
		else
		{
			return(x);
		}
		
		
	}
}
