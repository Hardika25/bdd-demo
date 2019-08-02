package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test {
	@Given("^User will select products$")
	public void user_will_select_products() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("select product");
	   // throw new PendingException();
	}

	@Given("^User will add products to Cart$")
	public void user_will_add_products_to_Cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("user adds product to cart");
	}

	@When("^User clicks on show cart$")
	public void user_clicks_on_show_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("show cart");
	}

	@Then("^show the list of products to user from cart$")
	public void show_the_list_of_products_to_user_from_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("added");
	    //throw new PendingException();
	}


}
