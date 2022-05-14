package br.com.mcoelho.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberReport.json", "pretty"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/",
        glue = "src/test/java/br/com/mcoelho/steps/",
        tags = ""

)
public class RunnerTest {
}
