package intro;

public class alert extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		Launch("Chrome", "https://www.tutorialspoint.com/selenium/practice/alerts.php");
		Wait(1000);
		
		Xpath("//button[@onclick='showAlert()']").click();
		Wait(2000);
		driver.switchTo().alert().accept();
		
		Xpath("//button[@onclick='myMessage()']").click();
		Wait(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Xpath("//button[@onclick='myDesk()']").click();
		driver.switchTo().alert().dismiss();
		Wait(3000);
		Xpath("//button[@onclick='myDesk()']").click();
		driver.switchTo().alert().accept();
	
		
		Xpath("//button[@onclick='myPromp()']").click();
		Wait(3000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().sendKeys("Nithish");
		driver.switchTo().alert().accept();
		
		
		
	}

}
