package starter.actions;

import net.serenitybdd.core.steps.UIInteractions;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starter.utilities.Constantes;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEqualCompressingWhiteSpace.equalToIgnoringWhiteSpace;

public class LoginActions extends UIInteractions {

    protected Logger logger = LoggerFactory.getLogger(LoginActions.class);

    @Step("Entrar a la página del Log In")
    public void enterLoginPage() {
        openUrl(Constantes.PAGINA_LOG_IN);
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
