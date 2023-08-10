package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartPageSteps {
	@When("add product into the cart from PDP")
	public void add_product_into_the_cart_from_pdp() {
	    System.out.println("Add product");
	}

	@Then("validate user is able to add the product")
	public void validate_user_is_able_to_add_the_product() {
           System.out.println("Validate add product to cart");
	}

}
