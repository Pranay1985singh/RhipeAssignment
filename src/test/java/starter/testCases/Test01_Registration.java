package starter.testCases;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.Type;
import org.openqa.selenium.Keys;
import starter.pages.registrationForm;

public class Test01_Registration {
    public static Performable about(String parameter, String value) {
        return Task.where("{0} Enters values for '" + parameter + "' as '"+value+"'",
                Type.theValue(value)
                        .into(registrationForm.BusinessName_Field),
                Type.theValue(value)
                        .into(registrationForm.EntityID_Field),
                Type.theValue(value)
                        .into(registrationForm.Address1_Field),
                Type.theValue(value)
                        .into(registrationForm.City_Field),
                Type.theValue(value)
                        .into(registrationForm.State_Field),
                Type.theValue(value)
                        .into(registrationForm.Country_Field)
                        .thenHit(Keys.ENTER),
                Type.theValue(value)
                        .into(registrationForm.PostCode_Field),
                Type.theValue(value)
                        .into(registrationForm.MainPhone_Field),
                Type.theValue(value)
                        .into(registrationForm.WebSite_Field),
                Type.theValue(value)
                        .into(registrationForm.HearAbout_Field)
                        .thenHit(Keys.ENTER),
                Type.theValue(value)
                        .into(registrationForm.IndustryType_Field)
                        .thenHit(Keys.ENTER),
                Type.theValue(value)
                        .into(registrationForm.FirstName_Field),
                Type.theValue(value)
                        .into(registrationForm.LastName_Field),
                Type.theValue(value)
                        .into(registrationForm.DirectPhone_Field),
                Type.theValue(value)
                        .into(registrationForm.Email_Field)
                //Below code has been commented as application does not need to submitted.
//                Click.on(registrationForm.SingUpButton_Field)
                );
    }
}
