package com.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class GetTitleAndPrice extends BaseClass{
	
	public GetTitleAndPrice(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@title='Search for Products, Brands and More']")
	WebElement SearchField;
	
	@FindBy(xpath = "//button[@title='Search for Products, Brands and More']")
	WebElement SearchButton;
	
	@FindBy(xpath = "//div[@class='hCKiGj']")
	List<WebElement> TextAndPrice;
	
	public void EnterSearchField_Method(String text) {
		EnterElement(SearchField, text);
	}
	
	public void ClickSearchButton_Method() {
		ClickElement(SearchButton);
	}
	
	public void GetTextAndPrice_Method() {
		 MultipleElements(TextAndPrice);
	}
	

}
