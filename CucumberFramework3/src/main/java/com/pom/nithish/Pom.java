package com.pom.nithish;

import org.openqa.selenium.WebDriver;

import com.base.nithish.BaseClass;
import com.locators.nithish.TestLogin;

public class Pom extends BaseClass{

	public Pom(WebDriver pm) {
		this.driver=pm;
	}
	
	private TestLogin Login;
	public TestLogin getLogin() {
		if(Login==null) {
			Login= new TestLogin(driver);
		}
		return Login;
	}
}
