package selenium;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestngGroup {
	
	
	
	@Test 
	public void testone()
	{
		System.out.println("testone");
	}
	@Test
	@Parameters({"policyno"})
	public void testtwo(String policyno )
	{
		System.out.println(policyno);
		System.out.println("testtwo");
	}
	@Test
	public void testthree()
	{
		System.out.println("testone");
	}
	@Test
	public void testfour()
	{
		System.out.println("testone");
	}
	

}
