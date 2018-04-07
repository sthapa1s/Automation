package todoapp;

import org.junit.runner.RunWith;
import cucumber.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features"
		,glue={"stepdefinition"}
		,monochrome = false
		,format = {"pretty", "html:target/Destination"} 
		)

public class RunToDoApp {

}
