package signupcode;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signuppagecode {

	@Given("^Navigate to url$")
    public void navigate_to_url() throws Throwable {
       System.out.println("Navigate to url");
    }

    @When("^Insert all require details and click on signup button$")
    public void insert_all_require_details_and_click_on_signup_button(DataTable data) throws Throwable {
        List<List<String>> obj = data.asLists();
      System.out.println("First Name : " +obj.get(1).get(0));  
      System.out.println("Last Name : " +obj.get(1).get(1));
      System.out.println("Address : " +obj.get(1).get(2));
      System.out.println("Mobile number : " +obj.get(1).get(3));
    }

    @Then("^Pop message with successfully signup$")
    public void pop_message_with_successfully_signup() throws Throwable {
     System.out.println("Singnup Successfully");
    }

}
