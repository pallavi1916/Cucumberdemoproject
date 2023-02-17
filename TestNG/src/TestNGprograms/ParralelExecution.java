package TestNGprograms;

import org.testng.annotations.Test;

public class ParralelExecution 
{
   @Test
   public void Test1()
   {
	   System.out.println("Test1" +Thread.currentThread().getId());
   }
   @Test
   public void Test2()
   {
	   System.out.println("Test2" +Thread.currentThread().getId());
   }
   
}
