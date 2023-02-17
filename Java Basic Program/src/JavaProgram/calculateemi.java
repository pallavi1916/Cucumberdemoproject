package JavaProgram;

import java.util.Scanner;

public class calculateemi {
             
	public static void main(String args[])
	{
		//emi=P × r × (1 + r)n/((1 + r)n - 1)
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle Amount");
		int p= sc.nextInt();
		System.out.println("Enter the intrest rate ");
		int r = sc.nextInt();
		System.out.println("Enter numer of Month");
		int n=sc.nextInt();
		int pandi;
		int EMI;
		
		pandi = (p*r*(1+r)^n) / ((1+r)^n - 1);
		EMI = pandi / n ;
		System.out.println("The Emi is :" +pandi);
		System.out.println("The Actual Emi is :" +EMI);
		for(int a=2;a<EMI-1;a++)
		{
		
			if(EMI%2 == 0)
			{
				count=count+1;
				break;
			}
			
		}
		
		
		if(count == 0)
		{
		System.out.println("EMI is Prime Nuumber" +EMI);	
		}
		else
		{
			System.out.println("EMI is not Prime number " +EMI);
		}
		
	
	}
}
