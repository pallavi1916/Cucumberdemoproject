package Programs;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a = 50/0;
			System.out.println("Value is " +a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Executed Method");
		}
		finally
		{
			System.out.println("Finally Execution");
		}

	}

}
