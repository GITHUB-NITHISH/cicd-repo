package tests;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SampleTest extends BaseTest {

	
    @Test
    public void openAmazon_homepageTitle() {
        driver.get("https://www.amazon.in");
        String title = driver.getTitle();
        System.out.println("Title: " + title);
        assertTrue(title.toLowerCase().contains("amazon"));
	}
    
    public static void main(String[]args) {
    	SampleTest obj = new SampleTest();
    	obj.openAmazon_homepageTitle();
    }
}
