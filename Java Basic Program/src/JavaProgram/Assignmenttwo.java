package JavaProgram;

public class Assignmenttwo {
	
	public static void main(String args[])
	
	{
		//Find Largest Among three numbers using if..else statement
		
		double n1 = -4.5, n2 = 3.9, n3 = 2.5;
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+ " Is Greater Number");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+  " Is Greater Number");
		}
		else
		{
			System.out.println(n3+ " Is Greater Number");
		}
	}

}
