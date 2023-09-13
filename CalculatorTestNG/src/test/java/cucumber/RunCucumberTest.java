package cucumber;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
                features = {"src/test/resources/features"}
)
public class RunCucumberTest {
}
