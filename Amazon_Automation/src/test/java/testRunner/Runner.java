package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\test\\resources\\Feature\\AmazonSignin.feature",
    glue = {"stepDefinition","hooks"},
    tags = "@negative"
)
public class Runner {
	
}
