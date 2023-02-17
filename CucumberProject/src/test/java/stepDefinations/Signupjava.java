package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signupjava {

	WebDriver driver;
	
	@Given("^Navigate to Direct url$")
	public void Navigate_to_Direct_url()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		
	}
	@When("^Insert all require details and click on button$")
	public void Insert_all_require_details_and_click_on_button(DataTable data)
	{
		List<List<String>> obj = data.asLists();
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys(obj.get(1).get(0));
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys(obj.get(1).get(1));
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys(obj.get(1).get(2));
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys(obj.get(1).get(3));
		Select sd = new  Select(driver.findElement(By.xpath("//select[@name='UserTitle']")));
		sd.selectByVisibleText(obj.get(1).get(4));
		
	}
	@When("^Multiple (.+)$")
    public void multiple_and(String firstname,DataTable data1) {
		List<List<String>> obj1 = data1.asLists();
		
		
       for(int i=1;i<3;i++)
       {
    	   driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys(obj1.get(1).get(0));
    	   if(firstname.equalsIgnoreCase("Nikita"))
    	   {
    		   System.out.println("Correct First name");
    	   }
    	   else 
    	   {
    		   System.out.println("Incorrect First name");
    	   }
       }
    }
	@Then("^Successfully signup$")
	public void Successfully_signup() throws InterruptedException
	{
		Thread.sleep(1000);
		//driver.close();
	}
}
