package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/sample.feature",
  tags = "@login",
  glue = "stepDefs")
 public class RunCukesTest {
}
