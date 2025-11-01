package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class SearchMultipleText extends BaseClass{
	
	public SearchMultipleText(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search for Products, Brands and More']")
	WebElement search;
	
	@FindBy(xpath ="//button[@title='Search for Products, Brands and More']")
	WebElement searchButton;
	
	
	public void Search_Method(String text) {
		EnterElement(search, text );
	}
	
	public void SearchButton_Method() {
		ClickElement(searchButton);
	}
	


}
