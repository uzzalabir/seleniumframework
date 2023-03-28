package TestRunnerTwo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.base_parent;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//cucumber options
@CucumberOptions(features={"src/test/resources/Feature_Files"},
plugin={"json:target/cucumber.json"},
glue="StepDeffination", tags= {"@cart"}) // tags is responsible to run specific test case


public class testrunner extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	
	public void metasetup() {
		
		base_parent test = new base_parent();
		test.browserinit();
		
	}
	
	@AfterTest
	
	public void metacloseURL() {
		base_parent test = new base_parent();
		test.driver.quit();
		
	}

}
