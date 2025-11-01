package pageobjectmanager;

import org.openqa.selenium.WebDriver;

import baseClass.Base;
import pages.DashboardPage;
import pages.LoginPage;


public class Main_Pom extends Base{

	// updated of pojo
	
	public Main_Pom(WebDriver gt) {
		this.bs=gt;						// no pagefactory becoz no webelement here
	}
	
	private LoginPage lp;
	public LoginPage getLp() {
		if (lp==null) {						// avoid duplicate objects and create object only if it is null and it reuses it
			lp = new LoginPage(bs);
			
		}
		return lp;
	}

	
	private  DashboardPage sp;
	public DashboardPage getSp() {
		if (sp==null) {
			sp= new DashboardPage(bs);
		}
		return sp;
	}
	
	
}
	
	

