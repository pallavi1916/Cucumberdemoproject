package program;

public class NumberDigit {

	public static void main(String args[])
	{
		int a=123456;
		
		int count=0;
		while(a!=0)
		{
			a=a/10;//a=123456/10=12345,a=12345/10=1234,a=1234/10=123,
			count++;//1+1+1
		}
		System.out.println("Number digit is :" +count);
	}
}
