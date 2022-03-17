package mallory.logan.app.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber"},
        features = {"src/test/resources/feature-files"},
        glue = {"mallory.logan.app.cucumber"},
        tags = "not @disabled"
)
public class CucumberRunnerTest {

}
