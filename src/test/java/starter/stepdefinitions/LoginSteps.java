package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import starter.actions.LoginActions;
import starter.questions.authentication.PostLoginMessage;
import starter.screen.LoginPage;
import starter.screen.SecurePage;
import starter.tasks.navigation.Navigate;
import starter.utilities.Constantes;
import starter.utilities.LoginUser;


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

    @Given("{actor} is on the login page")
    public void on_the_login_page(Actor actor){
        actor.attemptsTo(
                Navigate.toLoginPage()
        );
    /*
        Serenity.reportThat("La página de Login debe mostrar el título correspondiente",
                () -> assertThat(loginPage.getTitleForm()).isEqualToIgnoringCase("Login Page"));

     */
    }

    @When("{actor} logs in with valid credentials")
    public void logs_in_with_username_and_password(Actor actor) {
        /*
        login.completeInputText(username, loginPage.getUsernameInput() );
        login.completeInputText(password, loginPage.getPasswordInput() );
        login.clickElement(loginPage.getSubmitButton());
        */
        actor.attemptsTo(
                login.as(LoginUser.VALID_USER)
        );

    }

    @Then("{actor} should see a successful login message")
    public void i_should_see_a_successful_login_message(Actor actor){
        //login.containsFlashMessage("asda", securePage.getFlashMessageText());
        actor.attemptsTo(
                Ensure.that(PostLoginMessage.PostLoginMessageDisplayed()).contains(Constantes.MENSAJE_LOG_IN_CORRECTO)
        );

    }


}
