package baseClass;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	public static WebDriver bs;
	
	public static void BrowserLaunch(String brw) {
		
		if(brw.equalsIgnoreCase("chromedriver")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\Downloadsws 64\\chromedriver_win32\\chromedriver.exe");
		 bs = new ChromeDriver();
		}
		else if(brw.equalsIgnoreCase("edgedriver")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\Welcome\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			 bs = new EdgeDriver();	
		}
		impwait(10);

	}
	public static void open_Webpage(String url) {
		bs.get(url);
	}
	
	public static void WindowMax() {
		bs.manage().window().maximize();
	}
	
	public static void SendK(WebElement wb, String ab) {
		
		wb.sendKeys(ab);	
		
		
	}
	public static void clicku(WebElement wc) {
		wc.click();
	}
	public static void titleu() {
		String title = bs.getTitle();
		System.out.println(title);
	}
	public static void currenturlu() {
		bs.getCurrentUrl();

	}
	public static void Navigateu(String ba) {
		bs.navigate().to(ba);
		
	}
	
	public static void backu() {
		bs.navigate().back();
	}
	public static void refreshu() {
		bs.navigate().refresh();
	}
	public static void forwardu() {
		bs.navigate().forward();
	}
	
	public static boolean issD(WebElement ele) {
		boolean disp = ele.isDisplayed();     
		return disp;
	}
	public static void impwait(int r) {
		bs.manage().timeouts().implicitlyWait(r,TimeUnit.SECONDS);
	}
	
	
	//DATA DRIVEN FROM EXCEL 
	
	public static String readxl(int r, int c) throws IOException {
		
		String fileL = "C:\\Users\\Welcome\\Desktop\\testdata2.xlsx";
		FileInputStream fis = new FileInputStream(fileL);      //excel open in input mode
		Workbook wb = new XSSFWorkbook(fis);						// workbook open
		Sheet sheetN = wb.getSheetAt(0);					//sheet
		Row row = sheetN.getRow(r);                       //row
		Cell cell = row.getCell(c);                           //cell
		
		DataFormatter dt = new DataFormatter();
		String fcv = dt.formatCellValue(cell);
		
		return fcv;

	}
	
	public static void writexcl(int r, int c, String value) throws IOException {
		
	
	String path ="C:\\Users\\Welcome\\Desktop\\testdata2.xlsx";
	FileInputStream fh = new FileInputStream(path);
	Workbook wb = new XSSFWorkbook(fh);
	Sheet s = wb.getSheet("Sheet1");
	
	Row row = s.getRow(r);
	if(row==null) {
		s.createRow(r);
	}
	Cell cell = row.getCell(c);
	if(cell==null) {
		row.createCell(c,CellType.STRING);
	}
	
	cell.setCellValue(value);
	
	FileOutputStream fos = new FileOutputStream(path);
	wb.write(fos);
	fos.close();
	System.out.println("write conmpleted");
}
	
	public static void elementSelect(String option,WebElement ele, String value) {
		
	   Select sct= new Select(ele);
		if (option.equalsIgnoreCase("text")) {
			sct.selectByVisibleText(value);
		}else if(option.equalsIgnoreCase("value")) {
			sct.selectByValue(value);
		}else if(option.equalsIgnoreCase("index")) {
			sct.selectByIndex(Integer.parseInt(value));
		}
	}
	

}