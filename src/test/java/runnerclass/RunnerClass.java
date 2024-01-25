package runnerclass;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import baseclass.baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "D:\\Eclipse\\Eclipse Workspace\\openmrs\\src\\test\\java\\openmrs.feature", glue = "com.openmrs.stepdefintion", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:Reports/cucumberReport.html", "json:Reports/cucumber/Cucumber.json" })

@RunWith(Cucumber.class)
public class RunnerClass {

	public static WebDriver driver;

	@BeforeClass
	public static void openbrowser() {
		try {
			driver = baseclass.browserLaunch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}
