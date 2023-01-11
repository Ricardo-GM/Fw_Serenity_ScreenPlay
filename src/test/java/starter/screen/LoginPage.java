package starter.screen;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends PageObject {

    public static By USERNAME_INPUT = By.id("username");
    public static By PASSWORD_INPUT = By.id("password");
    public static By LOGIN_BUTTON = By.xpath("//*[@id='login']/button");

    @FindBy(id = "username")
    private WebElement inputUsername;

    @FindBy(id = "password")
    private WebElement inputPassword;

    @FindBy(xpath = "//*[@id='login']/button")
    private WebElement btnSubmit;

    @FindBy(xpath = "//*[@class='example']/h2")
    private WebElement titleForm;

    public  WebElement getUsernameInput() {
        return inputUsername;
    }

    public WebElement getPasswordInput() {
        return inputPassword;
    }

    public WebElement getSubmitButton() {
        return btnSubmit;
    }

    public String getTitleForm() {return titleForm.getText(); }
    







}
