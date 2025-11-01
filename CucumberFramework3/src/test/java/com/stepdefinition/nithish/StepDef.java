package com.stepdefinition.nithish;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.base.nithish.BaseClass;
import com.pom.nithish.Pom;
import com.reader.nithish.FileReaderManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef extends BaseClass{

	Pom ob = new Pom(driver);
	
	@Given("user Launch Browser")
	public void user_launch_browser() throws IOException {
	   Launch_Browser("FileReaderManager.getInstanceFR().getInstanceCR().getBrowser()");
	 
	}
	@Given("user Navigate To Url")
	public void user_navigate_to_url() throws IOException {
		Get_Url("https://practicetestautomation.com/practice-test-login/");
	}
	@When("user Enters Username In The Input Field")
	public void user_enters_username_in_the_input_field() throws IOException {
		SendKeys_Element(ob.getLogin().getTestLogin_Username(),"FileReaderManager.getInstanceFR().getInstanceCR().getUsername()");
	}
	@When("user Enters Password {string} In The Input Field")
	public void user_enters_password_in_the_input_field(String string) {
		SendKeys_Element(ob.getLogin().getTestLogin_password(), string);
	}
	@Then("user Clicks On Submit Button")
	public void user_clicks_on_submit_button() {
		 Click_Element(ob.getLogin().getTestLogin_submit());
	}
	@Then("It Navigates To Next Page and Verifies It")
	public void it_navigates_to_next_page_and_verifies_it() throws IOException {
		 Assert.assertEquals(ob.getLogin().getTestLogin_logged().getText(),"FileReaderManager.getInstanceFR().getInstanceCR().getExpectedString()");
	}
}
