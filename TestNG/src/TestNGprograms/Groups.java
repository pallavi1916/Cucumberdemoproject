package TestNGprograms;

import org.testng.annotations.Test;

public class Groups 
{
    
	@Test(groups = "2")
	public void p1()
	{
		System.out.println("Chech Priority");
	}
	@Test(groups = "1")
	public void p2()
	{
		System.out.println("Chech Priority One");
	}
	@Test(groups = "2")
	public void p3()
	{
		System.out.println("Chech Priority Two");
	}
	@Test(groups = "1")
	public void p4()
	{
		System.out.println("Chech Priority Three");
	}
	@Test(groups = "2")
	public void p5()
	{
		System.out.println("Chech Priority Four");
	}

}
