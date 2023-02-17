package Java;

import java.util.Scanner;

public class SumOf_Digit {

	public static void main(String[] args) {
		// Sume of digit in number like 12345=15
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Number");
		 int num = sc.nextInt();
		int sum=0;
		//int num=12345;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
