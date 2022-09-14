package JavaFramework;

import io.cucumber.junit.*;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
	plugin = { "pretty", "json:target/cucumber.json" },
	features = { "src/test/resources/features" },
	glue = { "JavaFramework" },
	tags = "@Test"
)
public class RunCucumberTest {}
