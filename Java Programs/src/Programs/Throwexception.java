package Programs;

public class Throwexception {

	
	public static void validate(int age)
	{
		if (age<18)
			throw new ArithmeticException(" Not Valid");
		else
		{
			System.out.println("Valid Age");
		}
	}
	public static void main(String[] args) {
		// 
		validate(20);
		System.out.println("age is not validated");
	}

}
