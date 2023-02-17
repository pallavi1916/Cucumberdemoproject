package Java;

public class PrimeNumber {

	public static void main(String[] args) {
//	1.natural Number >1
//    2.which has only 2 factors 1 and itself
//    19->1 and 19-prime number
//    28->1,2,4,7,14,28-Not a Prime number
//    Examples-2,3,5,7,11,13,17
		
		int num=3;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++)//1 2 3
			{
				if(num%i==0)
				
					count++;
			}
				if(count==2)
				{
					System.out.println("Number is prime number");
				}
				else
				{
					System.out.println("Number is Not prime number");
				}
			
		}
		else
		{
			System.out.println("It is not Prime number");
		}

	}

}
