package appium_concept;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class clas {
public static AndroidDriver driver;
	
	@Test
	private void setCapabilities() throws MalformedURLException {
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	capabilities.setCapability("appium:automationName", "UiAutomator2");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "13");
	capabilities.setCapability("udid", "ROLVYXORYD7DKVWK");
	capabilities.setCapability("deviceName", "NICKIE");
    capabilities.setCapability("appPackage", "com.google.android.calculator");
	capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
   
    URL  url = new URL("http://0.0.0.0:4723/wd/hub");
	driver = new AndroidDriver(url, capabilities);

	}

}
