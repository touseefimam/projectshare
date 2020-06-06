package ups.bdd.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= {"src/test/resources/FeatureFiles"},
		glue= {"ups.bdd.stepDefinition","ups.bdd.utility"},
		tags= {" @FunctionalTest,@RegressionTest"},
		plugin= {"pretty","html:target/cucumber-htmlreport","json:target/cucumber-report.json",     
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		
		monochrome = true
		)

public class RunnerClass extends AbstractTestNGCucumberTests{

}
