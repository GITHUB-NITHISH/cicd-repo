package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	Actions act;
	
	public void Launch() throws IOException {
	
		FileInputStream input = new FileInputStream("src\\test\\resources\\Properties\\Config.Property");
		prop= new Properties();
		prop.load(input);
		
		try {
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
				WebDriverManager.chromedriver().setup();
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get(prop.getProperty("url"));
			
		} catch (Exception e) {
			System.out.println("Browser didnt launch");
			Screenshot("src/test/resources/Screenshots/cantlaunch");
		}
		
	}
	
	public void teardown() throws InterruptedException {
		Waits(3000);
		driver.close();
		System.out.println("Browser closed");
	}
	
	public void EnterElement(WebElement element , String text) {
		try {
			element.sendKeys(text);
		} catch (Exception e) {
			System.out.println("Not able to enter");
			Screenshot("src/test/resources/Screenshots/cantenter");
		}
	}
	public void ClickElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("Not able to click");
			Screenshot("src/test/resources/Screenshots/cantclick");
		}
	}
	public void PageTitle() {
		try {
			System.out.println(driver.getTitle());
		} catch (Exception e) {
			System.out.println("Not able to get title");
			Screenshot("src/test/resources/Screenshots/cantgettitle");
		}
		
	}
	public void Screenshot(String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			System.out.println("Couldnt take screenshot");
		}
	}
	
	public void MultipleElements(List<WebElement> element) {
		List<WebElement> text = element;
		System.out.println(text.size());
		
		for(WebElement fe : text) {
			String text2 = fe.getText();
			System.out.println("*********************************");
			System.out.println(text2);
		}
	}
	public List<WebElement>  MultipleElements2(List<WebElement> element) {
		return element;
	}
	
	public void GetText(WebElement element) {
		System.out.println(element.getText());
	}
	
	public void Dropdown(WebElement element, String text) {
		Select drop = new Select(element);
		drop.selectByValue(text);
	}
	
	public void Scroll_Click(WebElement element) {
		try {
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			   js.executeScript("arguments[0].click();",element);
		} catch (Exception e) {
			System.out.println("Not able to scroll");
			Screenshot("src/test/resources/Screenshots/cantscroll");
		}	
	}
	
	public void Waits(int w) throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void MouseHover(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).build().perform();
		
	}
	
	public void MoveClickElement(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).click().build().perform();
		}
	
	public void Windowhandling(WebElement element) {
		String parent = driver.getWindowHandle();
		element.click();
		System.out.println(parent);
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow.size());
		for(String child : allwindow) {
			driver.switchTo().window(child);
			System.out.println(child);
		}
	}
	
	public void AttachScreenshot(Scenario sc) {
		
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		sc.attach(screenshot, "image/jpg", "FlipkartExtent");
	}
	
	
	

	
	
}
