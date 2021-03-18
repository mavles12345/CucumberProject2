package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition {

	@Before
	public void setup() {
	System.out.println("launch browser");

	}
	
	@After
	public void teadDown() {
	System.out.println("close browser");

	}

@Given("User is on the facebook page")
public void user_is_on_the_facebook_page() {
    
}

@When("User should enter the {string}, {string}")
public void user_should_enter_the(String string, String string2) {
    
}
@When("click the login button")
public void click_the_login_button() {
    
}


}