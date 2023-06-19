package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//monochrome = true,
		features = {"src\\test\\resources\\features"},
		glue = {"Step_Def"},
		tags = {"@Regression"},
		monochrome = true,
		dryRun =false,
		plugin = {"pretty", "html:test-output"}
		

		
		)






public class Runner {

}
