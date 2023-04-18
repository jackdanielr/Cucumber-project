package com.stepdefiniton.com;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.baseclass.org.BaseClass;
import com.pagefactory.org.PagesObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass{

	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
	   BaseClass.browserLaunch();
	}

	@When("Navigate to the login page")
	public void navigate_to_the_login_page() {
	   BaseClass.launchUrl("https://www.facebook.com/");
//	   PagesObject.userName().sendKeys("Ajay");
//	   PagesObject.passWord().sendKeys("1234567");
//	   PagesObject.clickLogin().click();
	   inputPass(PagesObject.userName(), "Praveen");
	   inputPass(PagesObject.passWord(), "143143143");
	   clickElement(PagesObject.clickLogin());
	}

	@Then("Validate the user landed in homepage")
	public void validate_the_user_landed_in_homepage() {
	 	    Assert.assertTrue(BaseClass.logoCheck(PagesObject.logo()));
	}

}
