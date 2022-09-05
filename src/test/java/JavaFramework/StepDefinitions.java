package JavaFramework;

import com.microsoft.playwright.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.nio.file.Paths;

public class StepDefinitions {

	@Given("an example scenario")
	public void an_example_scenario() {
		try (Playwright playwright = Playwright.create()) {
			Browser browser = playwright.chromium().launch();
			Page page = browser.newPage();
			page.navigate("http://whatsmyuseragent.org/");
			page.screenshot(
					new Page.ScreenshotOptions()
							.setPath(
									Paths.get(
											"./reportsJavaFramework/screenShots/example.png")));
		}
	}

	@When("all step definitions are implemented")
	public void all_step_definitions_are_implemented() {
	}

	@Then("the scenario passes")
	public void the_scenario_passes() {
	}
}
