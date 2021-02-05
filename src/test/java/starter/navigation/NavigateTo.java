package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theRhipeRegistrationHomePage() {
        return Task.where("{0} opens Sign up with Rhipe home page",
                Open.browserOn().the(RegistrationHomePage.class));
    }
}
