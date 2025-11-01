package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectclass extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		Launch("chrome", "https://www.amazon.in/");
		Wait(200);
		Select slc = new Select(Xpath("//select[@aria-describedby='searchDropdownDescription']"));
		slc.selectByVisibleText("Amazon Devices");
		Wait(400);
		slc.selectByValue("search-alias=freshmeat");
		Wait(400);
		slc.selectByIndex(9);
		
		boolean bl = slc.isMultiple();
		System.out.println(bl);
		
//		List<WebElement> options = slc.getOptions();
//		for(WebElement fe : options) {
//			System.out.println(fe.getText());
//		}
		
		List<WebElement> options2 = slc.getAllSelectedOptions();
		for(WebElement fe : options2) {
			System.out.println(fe.getText());
		}
	} 

}
