package JavaProgram;

public class funtionreturntype {
 
	public static void main(String args[])
	{
		funtionreturntype obj = new funtionreturntype();
		obj.highestno();
	}
	
	public int highestno()
	{
		int a= 900;
		int b=500;
		int result;
		
		if(a>b)
		{
			result=a;
			System.out.println("A is Highest Number");
			
		}
		
		else if(a<b)
		{
			result=b;
			System.out.println("B is Highest Number");
		}
		
		else
		{
			System.out.println("Both number is Equal");
		}
		return 0;
		
	}
}
