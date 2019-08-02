package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {


@Given("^User is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("HomePage");
}

@When("^User navigates to LogIn Page$")
public void user_navigates_to_LogIn_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	System.out.println("Login PAge");
}

@Then("^Message displayed Login Successfully$")
public void message_displayed_Login_Successfully() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   // throw new PendingException();
	System.out.println("successful");
}

}
