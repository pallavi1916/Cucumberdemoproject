package stepDefinations;


	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class Multipleidpassword {
		@Given("^Navigate to direct url$")
	    public void Navigate_to_direct_url() throws Throwable {
	        System.out.println("Navigate to url");
	    }

		@When("^Insert (.+) and (.+) and click on login button$")
	    public void insert_and_and_click_on_login_button(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }

	    @Then("^User should in home page$")
	    public void User_should_in_home_page() throws Throwable {
	    	System.out.println("in then method");
	    }
	

}
