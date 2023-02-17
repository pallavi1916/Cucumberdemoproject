package program;

import java.util.Scanner;

public class tablesusingwhile {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int i = sc.nextInt();
		int a=1;
		int result=0;
		while(a<=10)
		{
			result=i*a;
			System.out.println("Table =" +result);
			a++;
		}
	}
}
