package starter.questions.authentication;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import starter.screen.SecurePage;


public class PostLoginMessage {

    static SecurePage securePage;

    public static Question<String> PostLoginMessageDisplayed() {
        return actor -> actor.asksFor(Text.of("#flash"));
    }
}
