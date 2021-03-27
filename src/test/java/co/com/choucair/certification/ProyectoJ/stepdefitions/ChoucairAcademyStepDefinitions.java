package co.com.choucair.certification.ProyectoJ.stepdefitions;

import co.com.choucair.certification.ProyectoJ.questions.Answer;
import co.com.choucair.certification.ProyectoJ.tasks.Login;
import co.com.choucair.certification.ProyectoJ.tasks.OpenUp;
import co.com.choucair.certification.ProyectoJ.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than Julian wants to learn automation at the academy choucair$")
    public void thanJulianWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));

    }


    @When("^He search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseFoundationExpressOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesFoundationExpress(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

}
}