package TestNGprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot
{
	static WebDriver driver;
	@Test
	public void Takescreenshot()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();
		
		driver.get("https://mobile.callistoitsolutions.com/");
		//TakesScreenshot.takeSnapshot(driver,"D://test.png");

	}
	
	public static void takeSnapshot(WebDriver webdriver,String FileWithPath)throws IOException
	
	{
	    
		TakesScreenshot scrshot = ((TakesScreenshot)webdriver);
		File Scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		File Destfile = new File(FileWithPath);
		//FileUtils.copyFile(Scrfile,Destfile);
		//takeSnapshot(driver,"D://test.png");
		FileHandler.copy(Scrfile, new File(System.getProperty("user.dir")+ "\\image.png"));
	}
	

}
