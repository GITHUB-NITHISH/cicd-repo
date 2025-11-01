package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	
	public static void Launch() {
		// set path of executable browser driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\Seleniumm\\Chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		


	}

	public static void main(String[] arg) {
		Launch();
	}
}
