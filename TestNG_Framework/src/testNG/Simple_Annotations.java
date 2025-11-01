package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	public void setup() {
		System.out.println("setup");
	}
	
	@AfterSuite
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println("Browserlaunch");
	}
	
	@BeforeClass
	public void launchUrl() {
		System.out.println("Launch url");
	}
	@BeforeMethod
	public void login() {
		
	}
	@Test
	public void searchLaptop() {
		System.out.println("Laptop");
	}
	@Test
	public void searchMobile() {
		System.out.println("Mobile");
	}
	@AfterMethod
	public void verifyResults(){
		System.out.println("verifyResults");
	}
	@AfterClass
	public void logout() {
		System.out.println("logout");
	}
	@AfterTest
	public void deleteCookies() {
		System.out.println("delete cookies");
	}
	
	

}
