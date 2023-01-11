package starter.actions.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import starter.utilities.Constantes;

public class Navigate {

    @Step("Navegar hacia la página de Login")
    public static Performable toLoginPage() {
        return Open.url(Constantes.PAGINA_LOG_IN);
    }
}
