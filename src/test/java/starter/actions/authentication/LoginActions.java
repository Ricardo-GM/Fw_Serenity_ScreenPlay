package starter.actions.authentication;

import net.serenitybdd.core.steps.UIInteractions;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starter.screen.LoginPage;
import starter.utilities.LoginUser;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginActions extends UIInteractions {

    static LoginPage loginPage;

    protected Logger logger = LoggerFactory.getLogger(LoginActions.class);

    public static Performable as(LoginUser loginUser) {
        return Task.where("{0} logs in as a " + loginUser,
                Enter.theValue(loginUser.username).into(loginPage.USERNAME_INPUT),
                Enter.theValue(loginUser.password).into(loginPage.PASSWORD_INPUT),
                Click.on(loginPage.LOGIN_BUTTON)
        );
    }


}
