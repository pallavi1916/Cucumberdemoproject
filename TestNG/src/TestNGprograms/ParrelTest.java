package TestNGprograms;

import org.testng.annotations.Test;

public class ParrelTest 
{
	 @Test
	   public void Test3()
	   {
		   System.out.println("Test3" +Thread.currentThread().getId());
	   }
	   @Test
	   public void Test4()
	   {
		   System.out.println("Test4" +Thread.currentThread().getId());
	   }
}
