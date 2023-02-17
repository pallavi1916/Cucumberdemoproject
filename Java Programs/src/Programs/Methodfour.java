package Programs;

public class Methodfour {

	
	public  void Add(int x, int y, int z)
	{
		int w = x+y+z;
		System.out.println("Addition Of Three Number is : " +w);
	}
	
	public  void Subtract(int a, int b)
	{
		int c=a-b;
		System.out.println("Subtraction Of Two Number is : " +c);
	}
	
	public  void Division(int l, int m)
	{
		int n=l-m;
		System.out.println("Division Of Two Number is : " +n);
	}
	
	
	public  void Multiplication(int s,int t)
	{
		int d= s*t;
		System.out.println("Multiplication of Two Number is : " +d);
	}
	
	public  void Modulo(int h, int s)
	{
		int k= h%s;
		System.out.println("Modulo Of Two Number is : " +k);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodfour obj1 = new Methodfour();
		
		obj1.Add(23, 45, 6);
		obj1.Subtract(789, 56);
		obj1.Division(560, 12);
		obj1.Multiplication(34, 18);
		obj1.Modulo(5, 7);
	}

}
