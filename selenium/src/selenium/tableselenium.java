package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableselenium {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@title='Select Departure date for availability']")).click();
        driver.findElement(By.xpath("//*[@id='divCalender']/center/table/tbody/tr[1]/td[1]/table/tbody/tr[6]/td[3]")).click();
	}
}
