package starter.pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class registrationForm {

    public static Target BusinessName_Field = Target.the("BusinessName field")
            .locatedBy("#CustomerName");
    public static Target EntityID_Field = Target.the("EntityID field")
            .locatedBy("#RegistrationNumber");
    public static Target Address1_Field = Target.the("Address1 field")
            .locatedBy("#Street1");
    public static Target City_Field = Target.the("City field")
            .locatedBy("#City");
    public static Target State_Field = Target.the("State field")
            .locatedBy("#Country");
    public static Target Country_Field = Target.the("Country field")
            .locatedBy("#Country");
    public static Target PostCode_Field = Target.the("PostCode field")
            .locatedBy("#Postcode");
    public static Target MainPhone_Field = Target.the("MainPhone field")
            .locatedBy("#MainPhone");
    public static Target WebSite_Field = Target.the("WebSite field")
            .locatedBy("#WebUrl");
    public static Target HearAbout_Field = Target.the("HearAbout field")
            .locatedBy("#Source");
    public static Target IndustryType_Field = Target.the("IndustryType field")
            .locatedBy("#IndustryType");
    public static Target FirstName_Field = Target.the("FirstName field")
            .locatedBy("#PrimaryContactFirstName");
    public static Target LastName_Field = Target.the("LastName field")
            .locatedBy("#PrimaryContactLastName");
    public static Target DirectPhone_Field = Target.the("DirectPhone field")
            .locatedBy("#PrimaryContactPhone");
    public static Target Email_Field = Target.the("Email field")
            .locatedBy("#PrimaryContactEmail");
    public static Target SingUpButton_Field = Target.the("SingUpButton field")
            .locatedBy("#submitbutton");


    public static String parameter;
}
