package intro;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseClass {
	static WebDriver driver;
	
	public static void Launch(String type, String url) {
		if(type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Drivers\\chromedriver.exe");
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--headless");
			driver = new ChromeDriver();
			Maximize();
			driver.get(url);
		}
		else if(type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver","src\\test\\resources\\Drivers\\msedgedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new EdgeDriver();
			Maximize();
			driver.get(url);
		}
		else {
			System.out.println("Invalid driver");
		}
	}
	
	public static void Maximize() {
		driver.manage().window().maximize();
	}
	
	public static void Wait(int w) throws InterruptedException {
		Thread.sleep(w);
	}
	public static String Title() {
		return driver.getTitle();
	}
	
	public static String Url() {
		return driver.getCurrentUrl();
	}
	
	public static void Close() {
		driver.close();
	}
	public static void Quit() {
		driver.quit();
	}
	
	public static void NavigateTo(String url2) {
		driver.navigate().to(url2);
	}
	
	public static void NavigateForward() {
		driver.navigate().forward();
	}
	
	public static void NavigateBack() {
		driver.navigate().back();
	}
	public static void Refresh() {
		driver.navigate().refresh();
	}
	public static WebElement Element(By by) {
		return driver.findElement(by);
	}
	
	public static List<WebElement> Elementlist(By by){
		return driver.findElements(by);
	}
	
	public static WebElement Xpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
	
	 public static void Scrollinto_Element(WebElement element)
	   {
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("arguments[0].scrollIntoView();",element);
	   }
	
	
	
	
	

}
