package intro;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class MainClass extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		Launch("chrome", "https://www.amazon.in/");
		Wait(500);
		System.out.println(Url());
		System.out.println(Title());
		
		System.out.println(Element(By.id("nav-link-accountList-nav-line-1")).getText());
		System.out.println(Element(By.id("nav-link-accountList-nav-line-1")).getTagName());
		System.out.println(Element(By.id("twotabsearchtextbox")).getAttribute("id"));
	    System.out.println(Element(By.id("nav-logo-sprites")).getSize());
		
	    System.out.println(Element(By.xpath("//a[@class='nav-a  '][2]")).getText());
	    System.out.println(Element(By.xpath("//span[@class='nav-line-2 ']")).getText());
	    System.out.println(Element(By.xpath("(//h2[@class='a-color-base headline truncate-2line'])[3]")).getText());
	    System.out.println(Element(By.xpath("//a[text()='Mobiles']")).getText());
		System.out.println(Element(By.xpath("//h2[contains(text(),'Headphones')]")).getText());
	    System.out.println(Element(By.xpath("//span[contains(@id,'glow-ingre')][1]")).getText());
	    System.out.println(Element(By.xpath("//a[starts-with(@data-csa-c-content-id,'nav_avod')]")).getText());
//	    System.out.println(Element(By.xpath("//a[ends-with(@data-csa-c-content-id,'desktop_topnav')]")).getText());
	    
	    
	    //NavigateTo("https://www.amazon.com/ap/signin/");
//		Wait(200);
//		NavigateBack();
//		Wait(200);
//		NavigateForward();
//		Wait(200);
//		NavigateBack();
//		Wait(200);
//		Refresh();
	    
	    
	 //   Shop deals in fashion
	 //    (//h2[@class='a-color-base headline truncate-2line'])[2]	
	//     //h2[text()='Shop deals in Fashion']
	//     //h2[contains(text(),'deals in Fashion')]
	//   //h2[contains(@class,'headline truncate-2line')]
	//    //h2[starts-with(@class,'a-color')]
	//     //h2[ends-with(@class,'truncate-2line')]
	//  //h2[@class='a-color-base headline truncate-2line' and text()='Shop deals in Fashion']
	   
	   
	    NavigateTo("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-orders%2Forders%3Fref_%3Dnav_orders_first&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_retail_yourorders_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	   
	    
	    
	    
	    
	    

		
	
		

	}

}
