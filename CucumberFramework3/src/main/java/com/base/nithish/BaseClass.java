package com.base.nithish;



import java.io.File;

import java.io.FileReader;
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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	
	 public static WebDriver driver;
	   
	public static void Launch_Browser(String dr) {
		if(dr.equalsIgnoreCase("chrome")) {
		    System.setProperty("webdriver.chrome.driver", "C:\\NITHISH\\Chrome driver\\chromedriver-win64\\chromedriver.exe");
//		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
	}
	
	public static void Get_Url(String url) {
		driver.get(url);
	}
	public static void SendKeys_Element(WebElement s1, String s2) {
		s1.sendKeys(s2);
	}
	
	public static void Click_Element(WebElement c1) {
		c1.click();
	}
	
	public static void Clear_Element(WebElement cl) {
		cl.clear();
	}

	public static void Close_Browser() {
		driver.close();
	}
	
    public static void Quit_Window() {
    	driver.quit();
    }
    
	public static void Navigate_To(String s) {
		driver.navigate().to(s);	
	}
	
	public static void Navigate_Back() {
		driver.navigate().back();
	}
	public static void Navigate_Refresh() {
		driver.navigate().refresh();
	}
	public static void Navigate_Forward() {
		driver.navigate().forward();
	}
	
	public static boolean IsDisplayed_Element(WebElement w) {

			boolean disp = w.isDisplayed(); 
		return disp;
	}
	
	public static boolean IsSelected_Element(WebElement w) {
			boolean selec = w.isSelected();
		return selec;
	}
	
	public static boolean IsEnabled_Element(WebElement w) {
		boolean enab = w.isEnabled();
	return enab;
	}
	
	public static void Implicit_Wait(int w) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
    
	public static void Maximize_Window() {
		driver.manage().window().maximize();
	}
	
	
    public static void Select_ByVisibleText(WebElement sc1, String sc2) {
    	Select slc= new Select(sc1);
    	slc.selectByVisibleText(sc2);
    	
    }
    public static void Select_ByIndex(WebElement sc1, int sc2) {
    	Select slc= new Select(sc1);
    	slc.selectByIndex(sc2);
    }
    
    public static void Select_ByValue(WebElement sc1,String sc2 ) {
    	Select slc= new Select(sc1);
    	slc.selectByValue(sc2);
    }
    
    public static boolean isMultiple(WebElement sc1) {
    	Select slc= new Select(sc1);
    	boolean multiple = slc.isMultiple();
    	return multiple;
    }
    
   public static List<WebElement> getOptions(WebElement sc1) {
	   Select slc= new Select(sc1);
	   List<WebElement> options = slc.getOptions();
	   return options;
   }
   
   public static void accept_Alert() {
	   driver.switchTo().alert().accept();
   }
   
   public static void dismiss_Alert() {
	   driver.switchTo().alert().dismiss();
   }
   public static String getText_Alert() {
	   String text = driver.switchTo().alert().getText();
	   return text;
   }
    
   public static void Screenshot_Page(String path) throws IOException {
	   
	    TakesScreenshot ss =(TakesScreenshot)driver;   
		File sf= ss.getScreenshotAs(OutputType.FILE);    
		File df= new File(path);                 
		FileUtils.copyFile(sf,df);
   }
   
   public static void Screenshot_Element(String path,WebElement ss) throws IOException {
	   
		File sf= ss.getScreenshotAs(OutputType.FILE);    
		File df= new File(path);                 
		FileUtils.copyFile(sf,df);
   }
   
   public static void Doubleclick_Action(WebElement dbl) {
	   Actions act = new Actions(driver);
	   act.doubleClick(dbl).build().perform();
   }
   
   public static void Contextclick_Action(WebElement cntxt) {
	   Actions act = new Actions(driver);
	   act.contextClick(cntxt).build().perform();
   }
   
   public static void Click_Action(WebElement clk) {
	   Actions act = new Actions(driver);
	   act.click(clk).build().perform();
   }
   
   public static void moveTo_Action(WebElement mv) {
	   Actions act = new Actions(driver);
	   act.moveToElement(mv).build().perform();
   }
   
   public static void ClickAndHold_Action(WebElement ch) {
	   Actions act = new Actions(driver);
	   act.clickAndHold(ch).build().perform();
   }
   
   public static void Release_Action(WebElement rls) {
	   Actions act = new Actions(driver);
	   act.release(rls).build().perform();
   }
   
   public static void DragAndDrop_Action(WebElement dds,WebElement ddt) {
	   Actions act = new Actions(driver);
	   act.dragAndDrop(dds, ddt).build().perform();
   }
   
   public static void SwitchFrame_Index(int i) {
	   driver.switchTo().frame(i);
   }
   
   public static void SwitchFrame_Locator(String loc) {
	   driver.switchTo().frame(loc);
   }
   
   public static void SwitchFrame_WebElement(WebElement we) {
	   driver.switchTo().frame(we);
   }
   
   public static void SwitchTo_Parent() {
	   driver.switchTo().parentFrame();
   }
   
   public static String WindowHandle() {
	   String windowHandle = driver.getWindowHandle();
	   return windowHandle;
   }
   
   public static Set<String> WindowHandles() {
	   Set<String> windowHandles = driver.getWindowHandles();
	   return windowHandles;
   }
   
   public static void SwitchToWindow(String wh) {
	   driver.switchTo().window(wh);
   }
   
   public static void Scrollby_Pixel(long x,long y) {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(x,y)");
   }
   
   public static void Scrollto_Bottom() {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
   }
   
   public static void Scrollto_Top() {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
   }
   
   public static void Scrollinto_Element(WebElement element)
   {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView();",element);
   }
   
  
    public static String Prop_Read(String key)  {
    	
    	String path=".\\src\\test\\resources\\propertyfile\\PP.properties";
    	String pp=null;
    	try {
			FileReader fr= new FileReader(path);
			Properties prop= new Properties();
			prop.load(fr);
				pp = prop.getProperty(key);
				
				
		} catch (Exception e) {
			
		}
    	return pp;
    }
    		
   
    }
    
    
      
  
    
 



