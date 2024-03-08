package com.facebook.abc.gtl;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/facebook/abc/gtl/features",
        glue = {"com/facebook/abc/gtl/step_definitions", "com/facebook/abc/gtl/hooks"},
        dryRun = false,
        tags = "@Facebook",
        plugin = {"html:target/test-output.html", "json:target/test-output.json", "junit:target/test-output.xml"}
)
public class JunitRunner {
}
