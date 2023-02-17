package signupcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signupcode {
    
	WebDriver driver;
	
	@Given("^Navigate to urll$")
	public void Navigate_to_urll()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@When("Insert all require details and click on signup buttonn")
     public void Insert_all_require_details_and_click_on_signup_button()
     {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Rushali");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raut");
		driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.xpath("//input[@value='3']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/11/1989");
		driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
		driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
		sc.selectByVisibleText("Navigation Commands");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
     }
	@Then("Pop message with successfully signupp")
	 public void Pop_message_with_successfully_signup()
	 {
		driver.close();
	 }
	
}
