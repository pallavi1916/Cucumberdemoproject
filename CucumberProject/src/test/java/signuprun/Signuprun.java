package signuprun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/signup",glue="signupcode",tags="@SmokeTest")
public class Signuprun {

}
