package testNG;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_Crossbrowser {
	
	@Parameters ("browser")
	@BeforeClass
	public void launch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("chrome launched");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("firtefox launched");
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.out.println("edge launmched");
		}
	}
	
	@Test
	public void login() {
		System.out.println("logined");
	}

}

// not finished
