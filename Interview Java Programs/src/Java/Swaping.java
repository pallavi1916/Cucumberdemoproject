package Java;

public class Swaping {
	//Swapping two number 
	//swapping is a nothing but intechanging the value in the variable
	public static void main(String args[])
	{
		int a =10;
		int b =20;
		System.out.println("Before Swapping " +a+"  "+b);
		
		//Login 1 - use third varibale
		int t=a;
		a=b;
		b=t;
		 
		//logic 2 use  + and - dont use third variable
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		
		//logic3- multiplication nad divin operator ,here a and b values should not be zero
		a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20
		
		// logic4 -use bitwise opetarer XOR(^)
		a=a^b;//10^20=1010^10100=11110=30
		b=a^b;//30^20=11110^10100=1010=10
		a=a^b;//30^10=11110^1010=10100=20
		
		//logic 5-single statement
		b=a+b-(a=b);//10+20 -(10=20)=10 b=10,a=20
		System.out.println("After Swapping " +a+"  "+b);
		
		
	}

}
