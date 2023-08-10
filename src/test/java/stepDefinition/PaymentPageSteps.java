package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentPageSteps {
   
	@Given("user launch URL")
	public void user_launch_url() {
	     System.out.println("Launch URL");
	}

	@When("user login into the application")
	public void user_login_into_the_application() {
		   System.out.println("Login");
	}

	@When("add product to the cart and navigate to the checkout page")
	public void add_product_to_the_cart_and_navigate_to_the_checkout_page() {
	     System.out.println("Add product to cart");
	}

	@When("user select card payment method and add valid details")
	public void user_select_card_payment_method_and_add_valid_details() {
	     System.out.println("Payment");
	}

	@Then("validate successfull payment by card")
	public void validate_successfull_payment_by_card() {
	    System.out.println("Validate Payment");
	}



}
