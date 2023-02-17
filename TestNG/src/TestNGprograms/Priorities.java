package TestNGprograms;

import org.testng.annotations.Test;

public class Priorities 
{
  
	@Test
	public void p1()
	{
		System.out.println("Chech Priority");
	}
	@Test (priority = 5)
	public void p2()
	{
		System.out.println("Chech Priority One");
	}
	@Test (priority = 2)
	public void p3()
	{
		System.out.println("Chech Priority Two");
	}
	@Test (priority = 3)
	public void p4()
	{
		System.out.println("Chech Priority Three");
	}
	@Test (priority = 1)
	public void p5()
	{
		System.out.println("Chech Priority Four");
	}
}
