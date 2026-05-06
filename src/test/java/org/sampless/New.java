package org.sampless;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.NonNull;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.io.Files;

public class New {

	public static WebDriver driver;

	public static void launchbrowser(){ 
		driver = new ChromeDriver(); 
		}

	public static void Windowmaximize(){ 
		driver.manage().window().maximize(); 
	}
	
	public static void thread() throws InterruptedException {
		Thread.sleep(5000);
		
	}

	public static void openbrownser(String url) { 
		driver.get(url); 
	}

	public static void closetab(){ 
		driver.close(); 
	}

	public static void closepage(){ 
		driver.quit();
   }

	public static void pagetitle(){ 
		System.out.println(driver.getTitle( ));
	}
	

	public static void pageurl(){ 
		System.out.println(driver.getCurrentUrl()); 
	}

	public static void sendvalue(WebElement ref, String value){ 
		ref.sendKeys(value);
	}

	public static void clickbutton(WebElement ref){ 
		ref.click(); 
	}

	public static void uservalue(WebElement ref, String value){ 
		System.out.println(ref.getAttribute(value)); 
	}

	public static void elementmove(WebElement ref){ 
		Actions a1 = new Actions(driver);
		a1.moveToElement(ref).perform(); 
	}
	

	public static void dragdrop(WebElement sour, WebElement target){ 
		Actions a2 = new Actions(driver);;
		a2.dragAndDrop(sour, target).perform(); 
	}

	public static void rightclick(WebElement ref){ 
		Actions a3 = new Actions(driver); 
		a3.contextClick().perform(); 
	}

	public static void doubleclic(WebElement ref){ 
		Actions a4 = new Actions(driver);
		a4.doubleClick().perform(); 
	}
	
	public static void keyupdown(WebElement key, String value){ 
		Actions a4 = new Actions(driver);
		a4.keyDown(Keys.SHIFT).perform(); 
		key.sendKeys("value");
		a4.keyUp(Keys.SHIFT).perform();
	}
	

	public static void ente() throws AWTException { 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER); 
		r.keyRelease(KeyEvent.VK_ENTER); 
	}

	public static void tab() throws AWTException{ 
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
	    r1.keyRelease(KeyEvent.VK_TAB); 
	}

	public static void control() throws AWTException{ 
		Robot r = new Robot();
		r.keyPress (KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_C);
        r.keyRelease(KeyEvent.VK_CONTROL); 
    }

	public static void enter() throws AWTException{ 
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_V);
		r. keyRelease(KeyEvent.VK_V); 
		r.keyRelease(KeyEvent.VK_CONTROL); 
	}

	public static void alertaccept(){ 
		Alert a = driver.switchTo().alert(); 
		a.accept(); 
	}

	public static void alertdismiss(){ 
		Alert a = driver.switchTo().alert(); 
		a.dismiss(); 
	}

	public static void alertprompt(String value){ 
		Alert a = driver.switchTo().alert(); 
		a.sendKeys(value);
		System.out.println(a.getText()); 
	}
	
	public static void frameindex(int ref) {
		driver.switchTo().frame(ref);		
	}
	
	public static void frameref(WebElement ref) {
		driver.switchTo().frame(ref);		
	}
	
	public static void frameparent() {
		driver.switchTo().parentFrame();	
	}
	
	public static void framemain() {
		driver.switchTo().defaultContent();		
	}
	
	public static void screenshotss(WebElement ref) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		java.io.File tem = ts.getScreenshotAs(OutputType.FILE);
		java.io.File per = new java.io.File("path");
		Files.copy(tem, per);	
	}
	
	public static void jsscrole(WebElement ref) {
		JavascriptExecutor sd = (JavascriptExecutor) driver;
		sd.executeScript("arguments[0].scrollIntoView()", ref);
	}
	
	public static void jssendkeys(WebElement ref, String key) {
		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("arguments[0].setAttribute('value',' "+ key + " ')", ref);
	}
	
	
	public static void jsclick(WebElement ref) {
		JavascriptExecutor a = (JavascriptExecutor) driver;
		a.executeScript("arguments[0].click()", ref);
	}
	
	public static void jsgetribute(WebElement ref) {
		JavascriptExecutor a = (JavascriptExecutor) driver;
		Object print = a.executeScript("return arguments[0].getAttribute('value')", ref);
		System.out.println(print);
	}
	
	public static void checkdisplayed(WebElement ref) {
		if (ref.isDisplayed()) {
			ref.click();
			System.out.println("button is displayed and click");
		} else {
			System.out.println("Button not displayed");
		}
	}
	
	public static void checkenableselect(WebElement ref, WebElement ref2) {
		if (ref.isEnabled()) {
			System.out.println("Button is enable");
			 if (ref2.isSelected()) {
				System.out.println("Button already selected");
			} else {
				ref2.click();
				System.out.println("Button clicked");
			}
		} else {
			System.out.println("Button not enable");
		}
	}
	
	public static void navigateto(String url) {
		Navigation a = driver.navigate();
		a.to(url);
		}
	
	public static void navigateforwaed() {
		Navigation a = driver.navigate();
		a.forward();
	}
	
	public static void navigateback() {
		Navigation a = driver.navigate();
		a.back();
	}
	
	public static void navigaterefresh() {
		Navigation a = driver.navigate();
		a.refresh(); 
	}
	
	
	public static void dropdownselebyindex(WebElement ref, int value) {
		Select se = new Select(ref);
		se.selectByIndex(value);
	}
	
	public static void dropdownselebyvalue(WebElement ref, String value) {
		Select se = new Select(ref);
		se.selectByValue(value);
	}
	
	public static void dropdownselebyvisiblemethod(WebElement ref, String value) {
		Select se = new Select(ref);
		se.selectByVisibleText(value);
	}
	
	public static void dropdownismultiple(WebElement ref) {
		Select se = new Select(ref);
		boolean multiple = se.isMultiple();
		System.out.println(multiple);
	}
	
	public static void dropdownallselsectedoption(WebElement ref) {
		Select se = new Select(ref);
	    List<WebElement> allSelectedOptions = se.getAllSelectedOptions();	
	    System.out.println(allSelectedOptions);
	}
	
	public static void dropdownfirstselectedoption(WebElement ref) {
		Select se = new Select(ref);
	    WebElement firstSelectedOption = se.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}
	
	public static void dropdowndeselectall(WebElement ref) {
		Select se = new Select(ref);
	    se.deselectAll();
	}
	
	
	public static void dropdownprintallvalues(WebElement ref) {
		Select se = new Select(ref);
		List<WebElement> li = se.getOptions();
        for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
		}
	}
	
	
	public static void windowshandletwo() {
		String wind = driver.getWindowHandle();	
		Set<String> winds = driver.getWindowHandles();	
		
		for (String each : winds) {
			if (each!=wind) {
				driver.switchTo().window(wind);		}
		}
		
	}
	
	public static void windowhandlemultiple(int value) {
		Set<String> wind = driver.getWindowHandles();	
		
		List<String> li = new LinkedList<String>();	
		li.addAll(wind);
		System.out.println(li);
		String l2 = li.get(value);
		driver.switchTo().window(l2);		
	}
	
	public static void waitimplicit() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public static void waitweb() {
		new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public static void waituntillvisible(WebElement ref) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ref));
	
	}
	
	// Data driven store values in excel.
	
	public static void datadrivenset (String value, String valueS) throws IOException {
		
		// Create file.
		File  file = new File("C:\\Users\\APOP Computers\\eclipse-workspace\\DataMaven\\Excels\\"+value+".xlsx");
		
		// Access the excel
		XSSFWorkbook re = new XSSFWorkbook();
		
		// create a sheet
		XSSFSheet sheet = re.createSheet("Order amount");
		
		XSSFRow r1 = sheet.createRow(0);
		
		XSSFCell r1c1 = r1.createCell(0);
		XSSFCell r1c2 = r1.createCell(1);
		
		r1c1.setCellValue("Total");
		r1c2.setCellValue(valueS);
		
		FileOutputStream out = new FileOutputStream(file);
		
		re.write(out);
		
		System.out.println("Complete");
		
	}
	
	public static String datadrivengetmain(String excelpath, String sheetname, int row, int cell) throws IOException {
		
		File fi = new File(excelpath);
		FileInputStream inputStream = new FileInputStream(fi);
		Workbook wk = new XSSFWorkbook(inputStream);
		Sheet sh1 = wk.getSheet(sheetname);
		//String rownamString = sh1.getRow(row).getCell(cell).getStringCellValue();
		Row ro = sh1.getRow(row);
		Cell ce = ro.getCell(cell);
		
		String st;
		
		if (ce.getCellType()==1) {
			 st = ce.getStringCellValue();
			 System.out.println(ce);
		}
		else if (DateUtil.isCellDateFormatted(ce)) {
			Date d = ce.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-mm-yyyy");
			 st = sim.format(d);
			 System.out.println(st);
		}
		else {
			double d = ce.getNumericCellValue();
			long l = (long) d;
			 st = String.valueOf(l);
			 System.out.println(st);
		}
		return st;

	}

	
	
	
	public static void datadrivenwrite(String excelpath, int row1, int row2, int createcell1, int Createcell2, String setr1c1, String setr1c2, String setr2c1, String setr2c2 ) throws IOException {
				
		File fi = new File(excelpath);
		Workbook wk = new XSSFWorkbook();
		Sheet sh = wk.createSheet();
		Row r1 = sh.createRow(row1);
		
		Cell r1c1 = r1.createCell(createcell1);
		Cell r1c2 = r1.createCell(Createcell2);
		
		r1c1.setCellValue(setr1c1);
		r1c2.setCellValue(setr1c2);
		
		FileOutputStream outst = new FileOutputStream(fi);
        wk.write(outst);
		
	}
	
	
	
	public static void  datadrivenaddvalue(String excelpath, String sheetname, int row, int cell1, int cell2, String r1c1, String r1c2) throws IOException {
		
		File fi = new File(excelpath);
		FileInputStream inputStream = new FileInputStream(fi);
		Workbook wk = new XSSFWorkbook(inputStream);
		Sheet sh = wk.getSheet(sheetname);
		
		Row r3 = sh.createRow(row);
		
		Cell r3c1 = r3.createCell(cell1);
		Cell r3c2 = r3.createCell(cell2);
		
		r3c1.setCellValue(r1c1);
		r3c2.setCellValue(r1c2);
		
		FileOutputStream fil = new FileOutputStream(fi);
		wk.write(fil);
	}	
	
	
	
	public static void datadrivenmodifyvalue(String excelpath, String sheetname, int row, int cell, String setcellvalue) throws IOException {
		
		File fi = new File(excelpath);
		FileInputStream inputStream = new FileInputStream(fi);
		Workbook wk = new XSSFWorkbook(inputStream);
		Sheet sh1 = wk.getSheet(sheetname);
		Row ro = sh1.getRow(row);
		Cell ce = ro.getCell(cell);
		
		ce.setCellValue(setcellvalue);
		
		FileOutputStream outputStream = new FileOutputStream(fi);
		wk.write(outputStream);
	    
		
	}
	
	
	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void webdriverwait(String xpathloca, String passvalue) {
		WebDriverWait wd= new WebDriverWait(driver, Duration.ofSeconds(10)) ;
		@NonNull
		WebElement until = wd.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathloca)));
		until.sendKeys(passvalue);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	}
