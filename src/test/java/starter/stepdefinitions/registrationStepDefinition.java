package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.navigateTo;
import starter.common.functionsCollection;

public class registrationStepDefinition {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is on the Sign up with Rhipe home page on the internet")
    public void navigateToHomePage(Actor actor) {
        actor.wasAbleTo(
                navigateTo.theRhipeRegistrationHomePage());
    }

    @When("{actor} fills his {string} as {string}")
    public void enterEditBox(Actor actor, String parameter, String value) {
        actor.attemptsTo(
                functionsCollection.TextBox(parameter,value)
        );
    }

    @And("{actor} selects option for {string} as {string}")
    public void selectFromDropdown(Actor actor, String parameter, String value) {
        actor.attemptsTo(
                functionsCollection.DropDown(parameter,value)
        );
    }

    @Then("{actor} clicks on {string} button for {string}")
    public void clicksButton(Actor actor, String parameter, String value) {
        actor.attemptsTo(
                functionsCollection.Button(parameter,value)
        );
    }
}