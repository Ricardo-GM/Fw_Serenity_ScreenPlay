package starter.screen;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginPage extends PageObject {
    protected Logger logger = LoggerFactory.getLogger(LoginPage.class);

    @FindBy(id = "username")
    private WebElement inputUsername;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id='login']/button")
    private WebElement btnSubmit;

    public WebElement getUsernameInput() {
        return inputUsername;
    }

    public WebElement getPasswordInput() {
        return inputPassword;
    }

    public WebElement getSubmitButton() {
        return btnSubmit;
    }






}
