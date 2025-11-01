package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.Stepdefinition.Fashion_StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FashionPage extends BaseClass{
	
	public FashionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Fashion']")
	WebElement fashion;
	
	@FindBy(xpath = "//a[text()='Kids']")
	WebElement kids;
	
	@FindBy(xpath = "//a[text()='Boys & Girls Tshirts']")
	WebElement kidtshirt;
	
	@FindBy(xpath = "//div[text()='Price -- Low to High']")
	WebElement pricerange;
	
	public void Fashion_Method() {
		MouseHover(fashion);
	}
	
	public void Kids_Method() {
		MouseHover(kids);
	}
	
	public void kidtshirt_Method() {
		MoveClickElement(kidtshirt);
	}
	
	public void Pricerange_Method() {
		ClickElement(pricerange);
	}
	
}
