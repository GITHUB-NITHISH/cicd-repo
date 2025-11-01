package Front;

import java.io.IOException;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.Base;

public class front2 extends Base{
	public static void main(String[] args) throws IOException {
		
		Scanner nn= new Scanner(System.in);
		
		System.out.println("enter name : ");
		String nm = nn.nextLine();
		
//		BrowserLaunch(readxl(0, 1));
//		open_Webpage(readxl(1, 0));
//		
//		SendK(bs.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[1]")), readxl(2, 0) + "\n");
//		
//		WebElement fe = bs.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
//		
////		for(int i=0; i<product.size(); i++) {
////			writexcl(i, 7,0, product.get(i).getText());				// doubt
////			writexcl(i, 8,0, product.get(i).getText());
		
		
		writexcl(0,5,nm);
		}
	}
	
	


