package Java;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		//using algorithum 1
		
		/*int rev = 0;
		while(num!=0)
		{
			rev=rev*10 +num%10; //0*10+1234%10=4,4*10+123%10=43,43*10+12%10=432,432*10+1%10=4320+1=4321
			num=num/10;//1234/10=123,123/10=12,12/10=1,1/10=0
		}*/
		
		//using String buffer class
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();*/
		
		//using string buider method
		
		StringBuilder sb1= new StringBuilder();
		sb1.append(num);
		StringBuilder rev =sb1.reverse();
		
		System.out.println("Reverse number is" +rev);
	}

}
