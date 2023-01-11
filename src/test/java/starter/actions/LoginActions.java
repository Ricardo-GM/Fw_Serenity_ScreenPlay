package starter.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ui.Button;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starter.screen.LoginPage;
import starter.utilities.LoginUser;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualCompressingWhiteSpace.equalToIgnoringWhiteSpace;

public class LoginActions extends UIInteractions {

    static LoginPage loginPage;

    protected Logger logger = LoggerFactory.getLogger(LoginActions.class);

    public static Performable as(LoginUser loginUser) {
        return Task.where("{0} logs in as a " + loginUser,
                Enter.theValue(loginUser.username).into("#username"),
                Enter.theValue(loginUser.password).into("#password"),
                Click.on(Button.containingText("Login")));
    }


    @Step("Completar campo de texto")
    public void completeInputText(String inputText, WebElement inputElement) {
        inputElement.sendKeys(inputText);
        logger.info(java.text.MessageFormat.format("Entering the text: ", inputText));

    }

    @Step("Dar click a botón")
    public void clickElement(WebElement element) {
        element.click();
    }

    @Step("Comparar texto")
    public void containsFlashMessage(String expectedMessage , String realMessage) {
        assertThat(expectedMessage, equalToIgnoringWhiteSpace(realMessage.replaceAll("\n×","")));
        logger.info(java.text.MessageFormat.format("message: {0} is asserted", realMessage));
    }



}
