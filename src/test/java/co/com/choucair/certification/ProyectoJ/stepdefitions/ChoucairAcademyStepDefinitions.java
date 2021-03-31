package co.com.choucair.certification.ProyectoJ.stepdefitions;

import co.com.choucair.certification.ProyectoJ.model.AcademyChoucairData;
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

import java.util.List;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than Julian wants to learn automation at the academy choucair$")
    public void thanJulianWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData)throws Exception {
        OnStage.theActorCalled("Julian").wasAbleTo(OpenUp.thePage(), (Login.onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword())));

    }


    @When("^He search for the course on the choucair academy platform$")
    public void heSearchForTheCourseFoundationExpressOnTheChoucairAcademyPlatform(List<AcademyChoucairData> academyChoucairData)
        throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called resources$")
    public void heFindsTheCourseCalledResourcesFoundationExpress(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

}
}