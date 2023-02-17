package JavaProgram;

import java.util.Scanner;

public class factorialwithmethodoverloading {
	 
	  public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter first number");
		  int a = sc.nextInt();
		  System.out.println("Enter second number");
		   int b=sc.nextInt();
		   factorialwithmethodoverloading obj = new factorialwithmethodoverloading();
		   obj.cal(a);
		   obj.cal(a,b);
      }
	  
	  public void cal(int abc)
	  {
		  int result=1;
		  for(int count = 1; count <=abc; count++)
		  {
			  result = result * count;
		  }
		  System.out.println("Factoril is " +result);
	  }
	  public void cal(int x , int y)
	  {
		  int result = x + y;
		  
		  System.out.println("Addition is " +result);
	  }
}
