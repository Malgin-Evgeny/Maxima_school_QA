package cucumber;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        glue = {"src/test/java/cucumber/glue"},
        features = {"src/test/java/cucumber/features"}
)
public class RunCucumberTest {
}
