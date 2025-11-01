package Pojo;

import org.openqa.selenium.By;

import baseClass.Base;
import pageobjectmanager.Main_Pom;
import pages.DashboardPage;
import pages.LoginPage;

public class pom extends Base{

	
	// updated of pojo by page object manager
	
public static void main(String[] args) {
		
		BrowserLaunch("edgedriver");
		open_Webpage("https://www.facebook.com/");
		
		issD(bs.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")));   // normal method
		
	
		Main_Pom ob= new Main_Pom(bs);				// by one object can access multiple objects using getter method 
		
		boolean issD = issD(ob.getLp().getFbLogo());				
		System.out.println("fb logo displayed" + issD);
		clicku(ob.getLp().getCreateacc());
		System.out.println("clicked create account");
		
		
		
		
		
		boolean issD2 = issD(ob.getSp().getSignup());
		System.out.println("signup logo displayed  :" + issD2);
	
		SendK(ob.getSp().getFnam(),"test" );
		
		
		elementSelect("text",ob.getSp().getDay() ,"25");   //bytext
		elementSelect("value",ob.getSp().getMonth(),"11");      //byvalue
		elementSelect("index", ob.getSp().getYr(),"5");
		
		
	}
	
	
}



