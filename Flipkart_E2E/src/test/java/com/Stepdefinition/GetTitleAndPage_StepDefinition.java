package com.Stepdefinition;

import com.Base.BaseClass;
import com.Pages.GetTitleAndPrice;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class GetTitleAndPage_StepDefinition extends BaseClass {
	
	GetTitleAndPrice ob = new GetTitleAndPrice(driver);
	
	@Given("User enter search text in search field")
	public void user_enter_search_text_in_search_field() {
	  ob.EnterSearchField_Method("Shirt");
	}

	@When("User click search icon")
	public void user_click_search_icon() {
	   ob.ClickSearchButton_Method();
	}

	@When("Displays search result and get title and price")
	public void displays_search_result_and_get_title_and_price() {
	   ob.GetTextAndPrice_Method();
	}

}
