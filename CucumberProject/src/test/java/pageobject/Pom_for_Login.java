package pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_for_Login {
	WebDriver driver;
	public Pom_for_Login(WebDriver rdriver) {
		
		driver=rdriver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	// identify the web element
	
	@FindBy(id="Email")
	WebElement emailadd;
	
	@FindBy(id="Password")
	WebElement pass;
	
	@FindBy(xpath="//button")
			WebElement btn;
}
