package intro;



public class Scroll extends BaseClass {
	
	public static void main(String[] args) {
		
		Launch("chrome", "https://www.flipkart.com/search?q=mobile&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Scrollinto_Element(Xpath("//div[text()='GST Invoice Available']"));
		Xpath("(//div[@class='XqNaEv'])[9]").click();
	}

}
