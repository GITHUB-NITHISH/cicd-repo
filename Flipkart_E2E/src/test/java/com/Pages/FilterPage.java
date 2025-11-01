package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class FilterPage extends BaseClass{
	
	public FilterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//select[@class='Gn+jFg'])[1]")
	WebElement Min;
	
	@FindBy(xpath ="(//select[@class='Gn+jFg'])[2]")
	WebElement Max;
	
	@FindBy(xpath = "//div[text()='realme']//preceding-sibling::div")
	WebElement Brand;
	
	@FindBy(xpath ="//div[text()='8 GB and Above']//preceding-sibling::div")
	WebElement RamCheck;
	
	@FindBy(xpath = "//div[text()='Battery Capacity']/.")
	WebElement BatteryDrop;
	
	@FindBy(xpath ="//div[text()='5000 - 5999 mAh']//preceding-sibling::div")
	WebElement Battery;
	
	public  void Min_Method() {
		Dropdown(Min, "15000");

	}
	
	public  void Max_Method() {
		Dropdown(Max, "30000");
	}
	
	public void Brand_Method() {
		Scroll_Click(Brand);
	}
	
	public void Ram_Method() {
		Scroll_Click(RamCheck);
	}
	
	public void Battery_Method() {
		Scroll_Click(BatteryDrop);
		ClickElement(Battery);
	}
	

}
