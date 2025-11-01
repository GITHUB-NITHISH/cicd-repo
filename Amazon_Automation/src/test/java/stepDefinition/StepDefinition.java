package stepDefinition;

import java.time.Duration;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import configurationReader.ConfigReader;
import excelUtil.ExcelUtil;
import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;

public class StepDefinition extends BaseClass  {

    WebDriver driver = Hooks.driver;
    
    SignInPage signInPage = new SignInPage(driver);
    
    
	Map<String, String> testdata= ExcelUtil.testdata("Valid Login",ConfigReader.get("LoginTestData"));


	@Given("The user is on the Amazon Sign-In page")
	public void the_user_is_on_the_amazon_sign_in_page() {
		 try {
			    
		        // Open the Amazon sign-in URL
		        driver.get(ConfigReader.get("url"));
		        
//		        // Optional: CAPTCHA pause
//		        System.out.println("Solve CAPTCHA if shown, then press Enter to continue...");
//		        new java.util.Scanner(System.in).nextLine();

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));

		        String title = driver.getTitle();
		        if (!title.toLowerCase().contains("amazon")) {
		            throw new IllegalStateException("Amazon Sign-In page did not load correctly. Title: " + title);
		        }

		        System.out.println("Amazon Sign-In page loaded successfully.");

		    } catch (Exception e) {
		        System.err.println("Error navigating to Amazon Sign-In page: " + e.getMessage());
		        Assert.fail("Failed to load Amazon Sign-In page.");
		    }
	}

	@When("The user enters a valid email")
	public void the_user_enters_a_valid_email() {
		  System.out.println(testdata);
	      signInPage.enterEmail(testdata.get("Email/Phone"));
	}

	@When("Clicks the continue button")
	public void clicks_the_continue_button() {
	    signInPage.clickContinue();
	}

	@When("Enters a valid password")
	public void enters_a_valid_password() {
	   signInPage.enterPassword(testdata.get("Password"));
	}

	@When("Clicks the sign-in button")
	public void clicks_the_sign_in_button() {
        signInPage.clickSignIn();
	}

	@Then("The user should be redirected to the account homepage")
	public void the_user_should_be_redirected_to_the_account_homepage() {
	    WebElement name = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	    if(name.getText().equalsIgnoreCase(ConfigReader.get("UserName"))){
	    	System.out.println("Nithish Amazon page loaded");
	    }
	}
	
	@When("the user enters {string}")
	public void the_user_enters(String string) {
	   signInPage.enterEmail(string);
	}
	
	
	@Then("Appropriate Error message and icon should be displayed")
	public void appropriate_error_message_and_icon_should_be_displayed() {
	   if(signInPage.getEmailError().equalsIgnoreCase(testdata.
	}

	
	
}
