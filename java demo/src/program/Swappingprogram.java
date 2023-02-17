package program;

public class Swappingprogram {

	public static void main(String args[])
	{
		//Swapping two number
		int a=10;
		int b=20;
		System.out.println("Before Swapping " +a+"  "+b);
		// first logic-using third variable
		/*int temp=0;
		temp=a; //temp=10
		a=b;//a=20;
		b=temp;//b=10;*/
		
		
		// 2nd logic (Add and sub)
		/*a=a+b;//a=10+20=30
		b=a-b;//b=30-20=10
		a=a-b;//a=30-10=20*/
		
		
		//3rd logic(multiplication and divin)
//		a=a*b; //a=10*20=200
//		b=a/b; //b=200/20=10
//		a=a/b; //a=200/10=20
		
		
		//4th logic(Bitwise XOR)
//		a=a^b; //1010^10100=
//		b=a^b;
//		a=a^b;
		
		
		//5th logic
		b=a+b -(a=b); //a=20 b=30-20=10
		System.out.println("After Swapping " +a+"  "+b);
	}
	
	
}
