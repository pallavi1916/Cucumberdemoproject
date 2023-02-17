package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
 
   WebDriver driver;
	
	@Given("^Navigate to url$")
	public void Navigate_to_url()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@When("^Insert username and password and click on login button$")
	public void Insert_username_and_password_and_click_on_login_button()
	{
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Pallavi");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Raut");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("p@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Mednet");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9561732684");
		Select sc = new Select(driver.findElement(By.xpath("//select[@name='UserTitle']")));
		sc.selectByValue("Customer_Service_Manager_AP");
		Select sc1 = new Select(driver.findElement(By.xpath("//select[@name='CompanyEmployees']")));
		sc1.selectByValue("250");
		Select sc2= new Select(driver.findElement(By.xpath("//select[@name='CompanyCountry']")));
		sc2.selectByValue("DZ");
	}
	@Then("^User should land on home page$")
	public void User_should_land_on_home_page() 
	{
		driver.close();
	}
}
