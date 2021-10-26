package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.junit.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestStepDefs {
@Test
  @Given("user is logged")
  public void user_is_logged() {
 Response response = RestAssured.get("https://www.bbc.co.uk");
 long timeinMs = response.timeIn(TimeUnit.SECONDS);
 long ms = response.getStatusCode();
  System.out.println("millisec = %d "+ timeinMs);

  }
  @When("user click on picture")
  public void user_click_on_picture() {
    System.out.println("^^^^^User clicked on picture");

  }

  @Then("picture will be shown")
  public void picture_will_be_shown() {
    System.out.println("^^^^^Picture displayed");

  }
  @When("user inputs {} as {} and {} as {}")
  public void user_inputs_firstname_as_ramesh_lastname_as_pasupuleti_account_as_sortcode_as(String firstname, String firstnamevalue,String lastname, String lastnamevalue) {
  }


}
