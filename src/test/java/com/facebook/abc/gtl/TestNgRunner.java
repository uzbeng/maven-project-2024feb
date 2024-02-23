package com.facebook.abc.gtl;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/java/com/facebook/abc/gtl/features",
        glue = {"com/facebook/abc/gtl/step_definitions", "com/facebook/abc/gtl/hooks"},
        dryRun = false,
        tags = "not @Junit",
        plugin = {"html:target/test-output.html", "json:target/test-output.json"}
)
public class TestNgRunner extends AbstractTestNGCucumberTests {
}
