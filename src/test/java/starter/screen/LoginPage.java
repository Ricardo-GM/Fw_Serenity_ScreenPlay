package starter.screen;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends PageObject {

    protected Logger logger = LoggerFactory.getLogger(LoginPage.class);


    @FindBy(id = "username")
    private WebElementFacade inputUsername;

    @FindBy(id = "password")
    private WebElementFacade inputPassword;

    @FindBy(xpath = "//*[@id='login']/button")
    private WebElementFacade btnSubmit;

    @FindBy(id = "flash")
    private WebElementFacade flashMessage;

    @Step
    public void completeLoginForm(String username, String password) {
        inputUsername.sendKeys(username);
        logger.info(java.text.MessageFormat.format("Username: {0} entered...", username));
        inputPassword.sendKeys(password);
        logger.info(java.text.MessageFormat.format("Password: {0} entered...", password));
    }

    @Step
    public void submit() {
        btnSubmit.click();
        logger.info("Submit Button was clicked...");
    }

    @Step
    public void containsFlashMessage(String message) {
        logger.info(java.text.MessageFormat.format("message: {0} is asserted", message));
        flashMessage.getText().contains(message);
    }




}
