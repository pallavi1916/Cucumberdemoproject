package program;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
//		int rev=0;
//		while(num!=0)//
//		{
//			rev=rev*10+num%10; //rev= 0*10+12345%10=0+5=5, rev=5*10+1234%10=54,rev=54*10+123%10=543,rev=543*10+12%10=5432,rev=5432*10+1%10=54321
//			num=num/10; //12345/10=1234,1234/10=123,123/10=12,12/10=1,1/10=0
//		}
//		
		//using StringBulider
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		System.out.println(sb.reverse());
		//System.out.println(rev);
		
	}
}
