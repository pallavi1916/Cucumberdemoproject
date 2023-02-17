package selenium;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Testngone {

	@BeforeSuite
	public void firstsuite()
	{
		System.out.println("We are in suite Method");
	}
	@AfterSuite
	public void secondsuite()
	{
		System.out.println(" We are in secondsuite method");
	}
}
