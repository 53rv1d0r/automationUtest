package co.com.choucair.automation.utest.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features="src/test/resources/features/academyUtest.feature",
                  tags = "@stories",
                  glue = "co.com.choucair.automation.utest.stepdefinitions",
                  snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
