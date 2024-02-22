package com.facebook.abc.gtl;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/facebook/abc/gtl/features/sauce_demo.feature",
        glue = "com/facebook/abc/gtl/step_definitions",
        dryRun = false
)
public class JunitRunner {
}
