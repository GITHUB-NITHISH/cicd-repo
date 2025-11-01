package Pojo;

import org.openqa.selenium.By;

import baseClass.Base;
import pages.DashboardPage;
import pages.LoginPage;

public class pojo extends Base {
	
	// project object model
	
	public static void main(String[] args) {
		
		BrowserLaunch("edgedriver");
		open_Webpage("https://www.facebook.com/");
		
		issD(bs.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")));   // normal method
		
		LoginPage gh= new LoginPage(bs);            // pojo method
		
		boolean issD = issD(gh.getFbLogo());				
		System.out.println("fb logo displayed" + issD);
		clicku(gh.getCreateacc());
		System.out.println("clicked create account");
		
		
		
		DashboardPage gf = new DashboardPage(bs);
		
		boolean issD2 = issD(gf.getSignup());
		System.out.println("signup logo displayed  :" + issD2);
	
		SendK(gf.getFnam(),"test" );
		
		impwait(10);
		
		bs.close();
	}
}
		