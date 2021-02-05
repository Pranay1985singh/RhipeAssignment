package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.testCases.Test01_Registration;

public class registrationStepDefinition {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{actor} is on the Sign up with Rhipe home page on the internet")
    public void navigateToHomePage(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theRhipeRegistrationHomePage());
    }

    @When("{actor} fills his {string} as {string}")
    public void enterEditBox(Actor actor, String parameter, String value) {
        actor.attemptsTo(
                Test01_Registration.about(parameter,value)
        );
    }

    @And("{actor} fills {string} as {string}")
    public void enterEditBox1(Actor actor, String parameter, String value) {
        actor.attemptsTo(
                Test01_Registration.about(parameter,value)
        );
    }


    @And("{actor} selects option for {string} as {string}")
    public void selectFromDropdown(Actor actor, String parameter, String value) {
        actor.attemptsTo(
                Test01_Registration.about(parameter,value)
        );
    }

    @Then("{actor} clicks on {string} button for {string}")
    public void clicksButton(Actor actor, String parameter, String value) {
        actor.attemptsTo(
                Test01_Registration.about(parameter,value)
        );
    }
}