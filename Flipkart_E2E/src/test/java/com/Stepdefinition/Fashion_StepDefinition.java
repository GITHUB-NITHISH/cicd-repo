package com.Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.Pages.FashionPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fashion_StepDefinition extends BaseClass{
	
	FashionPage fp = new FashionPage(driver);

	@Given("User move to fashion link")
	public void user_move_to_fashion_link() {
		System.out.println("Before clicking fashion ++++++");
		PageTitle();
		
		fp.Fashion_Method();
	}

	@When("Cursor move to Kids")
	public void cursor_move_to_kids() {
		fp.Kids_Method();
	}

	@When("Move to Boys & Girls Tshirts")
	public void move_to_boys_girls_tshirts() {
		fp.kidtshirt_Method();
	}

	@When("Click high to low price link")
	public void click_high_to_low_price_link() {
		fp.Pricerange_Method();
	}

	@Then("It should display relavant details and get the title")
	public void it_should_display_relavant_details_and_get_the_title() throws InterruptedException {
		System.out.println("After all operations ++++++++++");
		PageTitle();

	}
	


}
