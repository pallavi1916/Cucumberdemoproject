package Java;

import java.util.Scanner;

public class NumberOfDigitsInNumber {

	public static void main(String[] args) {
		// Number of digit in number like 12345
		//Scanner sc = new Scanner(System.in);
		int num=123456;
		int count=0;
		while(num>0)
		{
			num=num/10; //123456,12345,1234,123,12,1,0,-1
			count++; //1+1+1+1+1+1
		}
		
		System.out.println("Number of digits " +count);

	}

}
