package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class UptoAddCartPage extends BaseClass{
	
	public UptoAddCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText ="Login")
	WebElement loginlink;
	
	@FindBy(xpath = "//li[text()='Flipkart Plus Zone']")
	WebElement Fpzone;
	
	@FindBy(xpath ="//span[text()='Home & Furniture']")
	WebElement HF;
	
	@FindBy(xpath = "//a[text()='Smart Security System']")
	WebElement SmartSystem;
	
	@FindBy(xpath = "//div[@data-id='HSAGBBXSQ6ABGUCC']")
	WebElement Hikvision;
	
	@FindBy(id = "pincodeInputId")
	WebElement Pincode;
	
	@FindBy( xpath ="//span[text()='Check']")
	WebElement PincodeCheck;
	
	public void MoveToLogin_Method() {
		MouseHover(loginlink);
	}
	
	public void ClickFpzone_Method() {
		MoveClickElement(Fpzone);
	}
	
	public void MoveToLink_Method() {
		MouseHover(HF);
	}
	
	public void ClickSSLink_Method() {
		ClickElement(SmartSystem);
	}
	
	public void ClickParticular_Method() {
		Scroll_Click(Hikvision);
	}
	
	public void EnterPincode_Method() throws InterruptedException {
		Windowhandling(Hikvision);
		Waits(2000);
		EnterElement(Pincode, "600005");
		ClickElement(PincodeCheck);
		
	}
	
}
