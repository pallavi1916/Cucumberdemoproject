package Java;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
       System.out.println("Enter a String ");
       String a = sc.next();
       String str=a;
       String rev="";
       int len=a.length();
       for(int i=len-1;i>=0;i--)
       {
    	   rev=rev+a.charAt(i);
       }
       if(str.equals(rev))
       {
    	   System.out.println(" string is Palindrome  " +str);
       }
       else
       {
    	   System.out.println(" string is Not Palindrome  " +str);  
       }
	}

}
