package Java;

public class Even_oddDigitIn_number {

	public static void main(String[] args) {
		// Number even and odd digits in number like 145678 even=3 odd=3
		int num=145678;
		int even=0;
		int odd=0;
		while(num>0)
		{
			int a =num%10;
			if(a%2==0)
			{
				even++;
				
			}
			else
			{
				odd++;
				
			}
			num=num/10;
		}
		System.out.println(even);
		System.out.println(odd);
		

	}

}
