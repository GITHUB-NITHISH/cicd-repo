package com.stepdefinition.com;



import org.openqa.selenium.By;
import org.testng.Assert;
import com.base.com.Base;
import com.pom.com.Pom;
import com.reader.com.FileReaderManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDef extends Base {
	
//	Pom ob= new Pom(driver);
	
	@Given("user Launch Browser")
	public void user_launch_browser() {
	   Launch_Browser("chrome");
	}
	@Given("user Navigate To Url")
	public void user_navigate_to_url() {
		Get_Url("https://practicetestautomation.com/practice-test-login/");
	}
	@When("user Enters Username In The Input Field")
	public void user_enters_username_in_the_input_field() {
		SendKeys_Element(driver.findElement(By.xpath("//input[@name='username']")), "student");
	}
	@When("user Enters Password {string} In The Input Field")
	public void user_enters_password_in_the_input_field(String string) {
		SendKeys_Element(driver.findElement(By.xpath("//input[@name='password']")), string);
	}
	@Then("user Clicks On Submit Button")
	public void user_clicks_on_submit_button() {
		 Click_Element(driver.findElement(By.xpath("//button[text()='Submit']")));
	}
	@Then("It Navigates To Next Page and Verifies It")
	public void it_navigates_to_next_page_and_verifies_it() {
		 Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).getText(), "Logged In Successfully");
	}
	
//	@When("user Enters Username {string} In The Input Field")
//	public void user_enters_username_in_the_input_field(String string) {
//	    SendKeys_Element(ob.getLogin().getTestLogin_Username(), string);
//	}
//	
////	@When("user Enters Password In The Input Field")
////	public void user_enters_password_in_the_input_field() {
////		
////		 SendKeys_Element(ob.getLogin().getTestLogin_password(), "vdhbhbsj");
////	}
//
//
//	@Then("user Verifies Error Message")
//	public void user_verifies_error_message() throws InterruptedException {
//		Implicit_Wait(30000);
//		String error = ob.getLogin().getTestLogin_error().getText();
//	    System.out.println(error);
//	    Implicit_Wait(30000);
//	    
//	    if(error.contains("username")) {
//		       Assert.assertEquals(error, "Your username is invalid!");
//	    }
//	    else if(error.contains("password"))
//	    	Assert.assertEquals(error, "Your password is invalid!");
//	}



	
}
