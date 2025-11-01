package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;

    // ✅ Load config.properties
    public static void loadConfig() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("src/test/resources/config/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ✅ Launch browser
    public static void launchBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    // ✅ Launch from config
    public static void initialize() {
        loadConfig();
        String browser = prop.getProperty("browser");
        String url = prop.getProperty("url");
        launchBrowser(browser);
        driver.get(url);
    }

    // ✅ Wait for an element
    public static WebElement waitForElement(By locator, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        return wait.until(driver -> driver.findElement(locator));
    }

    // ✅ Get page title
    public static String getPageTitle() {
        return driver.getTitle();
    }

    // ✅ Get current URL
    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    // ✅ Take screenshot
    public static void takeScreenshot(String fileName) {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("screenshots/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ✅ Close browser
    public static void closeBrowser() {
        if (driver != null) {
            driver.close();
        }
    }

    // ✅ Quit browser
    public static void quitBrowser() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // ✅ Get WebDriver instance
    public static WebDriver getDriver() {
        return driver;
    }
}