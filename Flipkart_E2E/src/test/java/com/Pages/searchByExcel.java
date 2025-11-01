package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class searchByExcel extends BaseClass {
	
	public searchByExcel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	

}
