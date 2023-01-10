package starter.screen;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecurePage extends PageObject {

    protected Logger logger = LoggerFactory.getLogger(SecurePage.class);

    @FindBy(id = "flash")
    private WebElement flashMessage;

    public String getFlashMessageText() {
        return flashMessage.getText();
    }

    public WebElement getFlashMessageElement() {
        return flashMessage;
    }
}
