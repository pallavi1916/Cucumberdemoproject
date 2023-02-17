package Java;

public class Factorial_number {

	public static void main(String[] args) {
		// A factorial is a function that multipies a number by every number below it.
//		for example -5!= 5*4*3*2*1=120
		int num=5;
		long factorial=1;
		
		//5!=1*2*3*4*5=120
		for(int i=1;i<=num; i++)//1 2 3 4 5
		{
			factorial=factorial*i; //1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
		}
		//5!= 5*4*3*2*1=120
		for(int i=num;i<=num;i--)
		{
			factorial =factorial*i;
		}
		System.out.println("Factorial Number is " +factorial);
		

	}

}
