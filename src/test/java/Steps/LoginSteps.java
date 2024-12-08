package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("user is on login page");
	}

	@When("user enters uname and pswd")
	public void user_enters_uname_and_pswd() {
		System.out.println("user enters uname and pswd");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicks on login button");

	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("user is navigated to home page");
	}
}
