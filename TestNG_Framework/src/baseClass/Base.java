package baseClass;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
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

	public static WebDriver driver;
	
	public static void Launch_Browser(String br) {
		
		if(br.equalsIgnoreCase("chromedriver")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNG\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
		
		}
		else if(br.equalsIgnoreCase("edgedriver")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\Welcome\\eclipse-workspace\\TestNG\\msedgedriver.exe");
			 driver = new EdgeDriver();	
		}
		Wait(10);

	}
	
	
	public static void Get_Url(String url) {
			driver.get(url);
	}
	
	public static void Window_Maximize() {
			driver.manage().window().maximize();
	}
	
	public static void SendKeys_Element(By by, String s) {
			driver.findElement(by).sendKeys(s);;
	}
	public void Window_Close() {
			driver.close();
	}
	public void Windows_Quit() {
		driver.quit();
	}
	public static void Click_Element(By by) {
		driver.findElement(by).click();
	}
	public static void Window_Title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static void Window_CurrentUrl() {
		driver.getCurrentUrl();

	}
	public static void Navigate_To(String s) {
		driver.navigate().to(s);
		
	}
	public static void Navigate_Back() {
		driver.navigate().back();
	}
	public static void Navigate_Refresh() {
		driver.navigate().refresh();
	}
	public static void Navigate_Forward() {
		driver.navigate().forward();
	}
	
	public static boolean Isdisp_Element(WebElement w) {
		boolean disp = w.isDisplayed();     
		return disp;
	}
	public static void Wait(int r) {
		driver.manage().timeouts().implicitlyWait(r,TimeUnit.SECONDS);
	}
	
	
	//DATA DRIVEN FROM EXCEL 
	
	
	public static void Read_Data(int r,int c) throws IOException {
		
		File f= new File("C:\\Users\\Welcome\\Desktop\\NITHISH\\My_Details.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		CellType celltype = cell.getCellType();
		if(celltype.equals(CellType.STRING)) {
			String scv = cell.getStringCellValue();
			System.out.println(scv);
		}else if(celltype.equals(CellType.NUMERIC)) {
			double db= cell.getNumericCellValue();
			System.out.println(db);
		}
	}
	

	
	public static void Write_Data() throws IOException {
		
		File f= new File("C:\\Users\\Welcome\\Desktop\\NITHISH\\TestData\\UserName and Password.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
//		wb.createSheet("Nithish2").createRow(1).createCell(0).setCellValue("MySecondName");
		wb.getSheet("Password List Template").getRow(1).getCell(4).setCellValue("Comment1");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Success");
				
	}
		
		
		
//		Sheet sheet = wb.getSheet();
//		Row row = sheet.getRow(r);
//		if(row==null) {
//			sheet.createRow(r);
//		}
//		Cell cell = row.getCell(c);
//		if(cell==null) {
//			row.createCell(c,CellType.STRING);
//		}
//		cell.setCellValue(s);
//		FileOutputStream fos = new FileOutputStream(path);
//		wb.write(fos);
//		fos.close();
//		System.out.println("write conmpleted");
//	}
	
	public static void Selecting(String s1,WebElement e, String s2) {
		
	   Select slc= new Select(e);
		if (s1.equalsIgnoreCase("text")) {
			slc.selectByVisibleText(s1);
		}else if(s1.equalsIgnoreCase("value")) {
			slc.selectByValue(s1);
		}else if(s1.equalsIgnoreCase("index")) {
			slc.selectByIndex(Integer.parseInt(s1));
		}
		Wait(10);
	}
	
	public static void W_handling(int wno) {
		Set<String> wh = driver.getWindowHandles();
		int count= 0;
		for(String str : wh) {
			count++;
			if(count==wno) {
				break;
			}
			
		}
	}}
	
	
}