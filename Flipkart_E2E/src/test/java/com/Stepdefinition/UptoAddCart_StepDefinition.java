package com.Stepdefinition;

import com.Base.BaseClass;
import com.Pages.UptoAddCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class UptoAddCart_StepDefinition extends BaseClass {
	
	UptoAddCartPage ob = new UptoAddCartPage(driver);
	
	@Given("User move to login link")
	public void user_move_to_login_link() {
	    ob.MoveToLogin_Method();
	    PageTitle();
	}

	@Then("User click flipkart plus zone")
	public void user_click_flipkart_plus_zone() throws InterruptedException {
	    ob.ClickFpzone_Method();
	    Waits(3000);
	}

	@Then("User move cursor to Home & furniture link")
	public void user_move_cursor_to_home_furniture_link() {
	    ob.MoveToLink_Method();
	}

	@Then("User Click Smart Security System link")
	public void user_click_smart_security_system_link() {
	    ob.ClickSSLink_Method();
	}

	@Then("User Scroll down page and click on particular result")
	public void user_scroll_down_page_and_click_on_particular_result() {
	   ob.ClickParticular_Method();
	}

	@Then("User Enter delivery pincode and click check link")
	public void user_enter_delivery_pincode_and_click_check_link() throws InterruptedException {
	   ob.EnterPincode_Method();

	}

	@Then("Pincode checked and displayed & Verify child and parent window")
	public void pincode_checked_and_displayed_verify_child_and_parent_window() {
		System.out.println("Child window title");
		PageTitle();
		Screenshot("src/test/resources/Screenshots/uptoaddcart.png");
		
	}

}
