package intro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Ss extends BaseClass{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Launch("chrome", "https://www.amazon.in/");
		Wait(1000);
		TakesScreenshot s1 = (TakesScreenshot) driver;
		File s2 = s1.getScreenshotAs(OutputType.FILE);
		File s3 = new File("src\\test\\resources\\Screenshot\\ss.png");
		FileUtils.copyFile(s2,s3);
		
		
		
		
		
		

	}

}
