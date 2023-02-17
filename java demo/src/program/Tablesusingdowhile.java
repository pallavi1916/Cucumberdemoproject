package program;

import java.util.Scanner;

public class Tablesusingdowhile {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x= sc.nextInt();
		int i=1;
		int result=0;
		do{
			result=x*i;
			System.out.println("Table is = " +result);
			i++;
		}while(i<=10);
		
	}
}
