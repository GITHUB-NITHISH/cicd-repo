package Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Secondscript {

	public static void main(String[] args) {
		
		WebDriver dr= new ChromeDriver();	// creating obj of chromedriver using webSriver ref variable
        
		String URL="https://openai.com/";
		dr.get(URL);
		
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 

		System.out.println("Website is opened successfully"); 
		
		 dr.close(); 
	
}
}
