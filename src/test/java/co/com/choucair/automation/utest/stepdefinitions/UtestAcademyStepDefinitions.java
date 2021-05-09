package co.com.choucair.automation.utest.stepdefinitions;

import co.com.choucair.automation.utest.model.AcademyUtestData;
import co.com.choucair.automation.utest.questions.Answer;
import co.com.choucair.automation.utest.tasks.Login;
import co.com.choucair.automation.utest.tasks.OpenUp;
import co.com.choucair.automation.utest.tasks.Search;
import com.sun.tools.javac.util.List;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestAcademyStepDefinitions {
    @Given("^than Alejandro wants to learn use utest at the Utest Academy$")
    public void thanAlejandroWantsToLearnUseUtestAtTheUtestAcademy(List<AcademyUtestData> academyUtestData) throws Exception {
        OnStage.theActorCalled("Alejandro").wasAbleTo(OpenUp.thePage(), Login.onThePage(academyUtestData.get(0).getStrUser(),academyUtestData.get(0).getStrPassword()));
    }


    @When("^he search for the course on the Utest Academy platform$")
    public void heSearchForTheCourseOnTheUtestAcademyPlatform(List<AcademyUtestData> academyUtestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyUtestData.get(0).getStrCourse()));
    }

    @Then("^he finds the course called$")
    public void heFindsTheCourseCalled(List<AcademyUtestData> academyUtestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyUtestData.get(0).getStrCourse())));
    }
}
