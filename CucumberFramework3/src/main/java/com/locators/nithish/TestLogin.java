package com.locators.nithish;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.nithish.BaseClass;


public class TestLogin extends BaseClass{
	
	public TestLogin(WebDriver lg) {
		this.driver=lg;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement TestLogin_Username;
	public WebElement getTestLogin_Username() {
		return TestLogin_Username;
	}
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement TestLogin_password;
	public WebElement getTestLogin_password() {
		return TestLogin_password;
	}
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement TestLogin_submit;
	public WebElement getTestLogin_submit() {
		return TestLogin_submit;
	}
	
	@FindBy(xpath="//h1[text()='Logged In Successfully']")
	private WebElement TestLogin_logged;
	public WebElement getTestLogin_logged() {
		return TestLogin_logged;
	}
	
	@FindBy(xpath="//div[@id='error']")
	private WebElement TestLogin_error;
	public WebElement getTestLogin_error() {
		return TestLogin_error;
	}

}
