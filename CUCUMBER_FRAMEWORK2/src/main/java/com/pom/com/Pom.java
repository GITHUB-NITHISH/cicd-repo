package com.pom.com;

import org.openqa.selenium.WebDriver;

import com.base.com.Base;
import com.locators.com.TestLogin;

public class Pom extends Base{

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
