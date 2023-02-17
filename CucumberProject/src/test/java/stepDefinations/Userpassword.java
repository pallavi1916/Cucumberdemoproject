package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Userpassword {

	 @Given("^Navigate to url $")
	    public void navigate_to_url() throws Throwable {
	        System.out.println("In Given function");
	    }

	    @When("^Insert \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	    public void insert_something_and_something_and_click_on_login_button(String strArg1, String strArg2) throws Throwable {
	    	  System.out.println("Username : " +strArg1);
	    	  System.out.println("Password : " +strArg2);
	    }

	    @Then("^User should be  on home page$")
	    public void User_should_be_on_home_page() throws Throwable {
	    	  System.out.println("In Then function");
	    }
	    
	    @Then("^User should get a message on wrong credentials$")
	    public void user_should_get_a_message_on_wrong_credentials() throws Throwable {
	        System.out.println("Get Wrong credentials");
	    }

	}


