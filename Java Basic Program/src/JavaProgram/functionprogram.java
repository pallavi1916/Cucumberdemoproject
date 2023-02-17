package JavaProgram;

public class functionprogram {
          
	public static void main(String args[])
	{
		functionprogram obj = new functionprogram();
		obj.add();
		obj.div();
		obj.mul();
		obj.sub();
	}
	
	public void add()
	{
		int a= 30;
		int b=70;
		int result= a+b;
		System.out.println("Addition :"  +result);
	}
	
	public void sub()
	{
		int a= 30;
		int b=70;
		int result= a-b;
		System.out.println("Substraction :"  +result);
	}
	
	public void div()
	{
		int a= 30;
		int b=70;
		int result= a/b;
		System.out.println("Division :"  +result);
	}
	
	public void mul()
	{
		int a= 30;
		int b=70;
		int result= a*b;
		System.out.println("Multiplication :"  +result);
	}
}
