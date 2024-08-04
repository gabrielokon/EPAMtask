package hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;

public class Hooks {
	

	    @Before
	    public void setUp() {
	        BaseTest.setUp();
	    }

	    @After
	    public void tearDown(Scenario scenario) {
	        if (scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "screenshot");
	        }
	        BaseTest.tearDown();
	    }
	}


