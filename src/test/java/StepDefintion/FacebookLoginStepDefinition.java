package StepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginStepDefinition {

@Given("Launch the Browser")
public void launch_the_browser() {
   System.out.println("launching Browser");
}

@Given("Open the Application")
public void open_the_application() {
	 System.out.println("Opening Apllication");
}

@When("user enter the valid username and password")
public void user_enter_the_valud_username_and_password() {
	 System.out.println("Entering credentials");
}

@Then("user click on login button")
public void user_click_on_login_button() {
	 System.out.println("Clicking login button");
}

@And("validate the login message")
public void validate_the_login_message() {
	System.out.println("validating message");
}
@And("close the browser")
public void close_the_browser() {
	System.out.println("closing browser");
}


}
