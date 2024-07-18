package runner_;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"G://spring-tool//sts-4.21.0.RELEASE//LenskartAutomation//src//test//resources//LenskartFunctionality//Lenskart.feature"},
		glue = {"Stepdef"}
		)
public class lenskartfunctionality1 extends AbstractTestNGCucumberTests {

}


