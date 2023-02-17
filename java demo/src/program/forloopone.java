package program;

public class forloopone {

	public static void main(String args[])
	{
		/*1
		12
		123
		1234
		12345*/
		
		for(int a =1; a <=5;a++)
		{
			
			for(int b = 1; b<=a; b++)
			{
				System.out.print(b+"");
			}
			System.out.println();
		}
	}
}
