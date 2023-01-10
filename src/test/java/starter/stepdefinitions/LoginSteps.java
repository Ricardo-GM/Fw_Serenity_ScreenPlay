package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import starter.actions.LoginActions;
import starter.screen.LoginPage;
import starter.screen.SecurePage;

public class LoginSteps {

    Actor actor;

    @Managed
    WebDriver navegador;

    @Steps
    LoginActions login;

    LoginPage loginPage;

    SecurePage securePage;



    @Before
    public void prepararEscenario() {
        //TODO añadir logica de Actores
    }

    @Given("I am on the login page")
    public void i_am_on_the_login_page(){
        login.enterLoginPage();

        //TODO añadir Assert para verificar que se entró a la página del login
    }

    @When("^I login with (.+) and (.+)")
    public void i_login_with_username_and_password(String username, String password) {
        login.completeInputText(username, loginPage.getUsernameInput() );
        login.completeInputText(password, loginPage.getPasswordInput() );
        login.clickElement(loginPage.getSubmitButton());

    }

    @Then("^I should see a flash message saying (.+)")
    public void i_should_see_a_flash_message(String message){
        login.containsFlashMessage(message, securePage.getFlashMessageText());

    }


}
