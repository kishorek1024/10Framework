package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project_Methods {
	
	public WebDriver driver;
	public FileInputStream fileObj;
	public Workbook WorkbookObj;
	public Sheet sheet;
	
	// Method Name  : launchApp
	// Description  : To Launch application
	// Author       : Kishore Kumar (Kumarki)
	// Date Created : 02252020
	// Reviewd By   : Jyothi
	// Arguments    : String url, String sspath 
	//************************************************************	
	public void launchApp(String url, String sspath) throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));
	}
	//*************************************************************
	// Method Name  : closeApp
	// Description  : To Close application
	// Author       : Kishore Kumar (Kumarki)
	// Date Created : 02252020
	// Reviewd By   : Jyothi
	// Arguments    : NA
	//************************************************************	
	public void closeApp(){
		driver.close();
	}
	//***************************************************************
	public void elementAvailable(WebElement element, boolean expresult, String sspath) throws Exception{
		boolean elementPresent=element.isDisplayed();
		if(elementPresent==expresult)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//********************************************************************
	public void excelCon(String excelfilepath, String sheetname) throws Exception{
		fileObj=new FileInputStream(excelfilepath);
	    WorkbookObj=Workbook.getWorkbook(fileObj);
	    sheet=WorkbookObj.getSheet(sheetname);
	}
	//*************************************************************************
	public void elementEnabled(WebElement element, boolean expresult, String sspath) throws Exception{
		boolean elementPresent=element.isEnabled();
		if(elementPresent==expresult)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//******************************************************************************
	public void titleContains(String exptext, boolean expValue){
		String title=driver.getTitle();
		if(title.contains(exptext)==expValue)
			System.out.println("Pass");
		else
			System.out.println("Fail");			
	}
	//*************************************************************************
	public void elementsCount(String loc, int exp){
		List<WebElement> elements=driver.findElements(By.tagName(loc));
		if(elements.size()==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
}

















