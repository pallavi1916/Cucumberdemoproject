package program;

import java.util.Scanner;

public class Stringprogram {

	public static void main(String args[])
	{
		//String name= "level";
		String reverse="";
		//System.out.println(name);
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the user name");
		 String name = sc.next();
		 System.out.println(name);
		for(int i=name.length()-1; i>=0;i--)
		{
			reverse = reverse+name.charAt(i);
		   
		}
		 System.out.println(name);
		 System.out.println(reverse);
		 if(name.equals(reverse))
		 {
			 System.out.println("String is Palidrome");
		 }
		 else
		 {
			 System.out.println("String is Not Palidrome");
		 }
	}
}
