package starter.stepdefinitions;


r
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.screen.LoginPage;

public class LoginStepDefinitions {

    @Steps
    private LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        loginPage.open();
    }

    @When("I login with (.+) and (.+)")
    public void i_login_with_username_and_password(String username, String password) {
        loginPage.completeLoginForm(username, password);
        loginPage.submit();
    }

    @Then("I should see a flash message saying (.+)")
    public void i_should_see_a_flash_message(String message){
        loginPage.containsFlashMessage(message);
    }

}
