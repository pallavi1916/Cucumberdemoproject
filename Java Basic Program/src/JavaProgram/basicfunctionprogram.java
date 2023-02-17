package JavaProgram;

public class basicfunctionprogram {

	public static void main(String args[])
	{
		System.out.println("I am in Main Function");
		
		// calling functions steps
		//create object of class
		basicfunctionprogram obj = new basicfunctionprogram();
		obj.demo();
		//obj.demo2();
		System.out.println("At Main Function End");
		
	}
	
	public void demo()
	{
		demo2();
		System.out.println("I am in demo Function");
		
	}
	public void demo2()
	{
		System.out.println("I am in demo2 function");
	}
}
