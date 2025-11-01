package com.Stepdefinition;

import java.io.IOException;

import com.Base.BaseClass;
import com.Pages.SearchPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_StepDefinition extends BaseClass {
	SearchPage sp = new SearchPage(driver);
	

	@When("Close the popup")
	public void close_the_popup() {
	   System.out.println(driver.getTitle());
	}

	@Then("It should navigate to homepage")
	public void it_should_navigate_to_homepage() {
	   sp.HomePage_Method();
	}

	@Given("User enters text in search field")
	public void user_enters_text_in_search_field() {
	   sp.SearchField_Method("Mobile");
	}

	@When("Click search button")
	public void click_search_button() {
	   sp.ClickField_Method();
	}

	@Then("It should navigate to search result page")
	public void it_should_navigate_to_search_result_page() {
	   sp.Resultpage_Method();
	}
	
	@Then("Extract results and print in console")
	public void extract_results_and_print_in_console() {
	   System.out.println("****************************************");
	   sp.EntireElement_Method();
	 
	}

	@Then("print eighth result and keep it in console")
	public void print_third_result_and_keep_it_in_console() {
	   sp.EighthElement_Method();
	   System.out.println("********************");
	}
	
	@Then("print mobile name and its price")
	public void print_mobile_name_and_its_price() {	
		sp.PhoneNamePrice();
	}
	
	@Then("print mobile name")
	public void print_mobile_name() {
	    sp.PhoneName_Method();
	}

	@Then("print mobile prices")
	public void print_mobile_prices() throws InterruptedException {
	    sp.PhonePrice_Method();
	   
	}
	



}
