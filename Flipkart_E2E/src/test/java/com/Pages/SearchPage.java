package com.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class SearchPage extends BaseClass {
	
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);    // used to initialize all elments
	}
	
	@FindBy(xpath = "//input[@class='Pke_EE']")	
	WebElement Search;
	
	@FindBy(xpath = "//html[@lang='en-IN']")
	WebElement Homepage;
	
	@FindBy(xpath = "//html[@lang='en']")
	WebElement ResultPage;
	
	@FindBy(xpath ="//div[@class='col col-7-12']")
	List<WebElement> EntireElement;
	
	@FindBy(xpath ="(//div[@class='col col-7-12'])[8]")
	WebElement EighthElement;
	
	@FindBy(xpath = "//div[@class='DOjaWF YJG4Cf']//div[@class='KzDlHZ']")
	List<WebElement> PhoneName;
	
	@FindBy(xpath ="//div[@class='DOjaWF YJG4Cf']//div[@class='hl05eU']//div[1]")
	List<WebElement> PhonePrice;
	
	public void SearchField_Method(String text) {
		EnterElement(Search, text);
	}
	
	public void ClickField_Method() {
		Search.sendKeys(Keys.ENTER);
	}
	
	public void HomePage_Method() {
		System.out.println("Homepage displayed status : " + Homepage.isDisplayed());
	}
	
	public void Resultpage_Method() {
		System.out.println(ResultPage.isDisplayed());
		System.out.println(driver.getTitle());
	}
	
	public void EntireElement_Method() {
		MultipleElements(EntireElement);
	}
	
	public void EighthElement_Method() {
		GetText(EighthElement);
	}
	
	public List<WebElement> PhoneName_Method() {
	    return MultipleElements2(PhoneName);
	}
	public List<WebElement> PhonePrice_Method() {
		return MultipleElements2(PhonePrice);
	}
	
	public void PhoneNamePrice() {
		int size2 = PhoneName_Method().size();
		for (int i=0; i<size2 ; i++){
			System.out.println(PhoneName_Method().get(i).getText() + " - " + PhonePrice_Method().get(i).getText() );
		}
	}
	
	
	

}
