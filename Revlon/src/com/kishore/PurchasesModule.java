package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.PO_HomePage;
import com.qshore.PO_LoginPage;
import com.qshore.Project_Methods;

public class PurchasesModule {
	
	// Test Name  : Purchases_Login
	// Test Script Name : Purchases_Login
	// Module Name      : Purchases
	// Project Name     : Automobiles
	// Author           : Kishore Kumar
	// Date Created		: 02282020
	// Reviewd By       : Sudha
	// Arguments        : 
	//*********************************************************************************	
	public void Purchases_Login() throws Exception{
		
		// Importing Methods Class
		Project_Methods methods_Obj=new Project_Methods();
		
		// Import Execl_Con Method
		methods_Obj.excelCon("C:\\Users\\DELL\\Desktop\\FW10\\Test Data\\Kishore\\Purchases\\LoginTest.xls", "Sheet1");
				
		// Call launchApp method to launch App
		methods_Obj.launchApp(methods_Obj.sheet.getCell(0, 0).getContents(), "C:\\Users\\DELL\\Desktop\\FW10\\Test Results\\Kishore\\Purchases\\Purchases_LoginTest\\launchApp.png");
		
		// Importing Page Objects of Login Page
		PO_LoginPage loginpage=PageFactory.initElements(methods_Obj.driver, PO_LoginPage.class);
		
		// Verify uid and pwd available or not
		methods_Obj.elementAvailable(loginpage.Loginpage_UserID, true, "C:\\Users\\DELL\\Desktop\\FW10\\Test Results\\Kishore\\Purchases\\Purchases_LoginTest\\uidavailable.png");
		methods_Obj.elementAvailable(loginpage.LoginPage_PWD, true, "C:\\Users\\DELL\\Desktop\\FW10\\Test Results\\Kishore\\Purchases\\Purchases_LoginTest\\pwdavailable.png");
		
		// Verify UID and pwd enabled or not
		methods_Obj.elementEnabled(loginpage.Loginpage_UserID, true, "C:\\Users\\DELL\\Desktop\\FW10\\Test Results\\Kishore\\Purchases\\Purchases_LoginTest\\uidenabled.png");
		methods_Obj.elementEnabled(loginpage.LoginPage_PWD, true, "C:\\Users\\DELL\\Desktop\\FW10\\Test Results\\Kishore\\Purchases\\Purchases_LoginTest\\pwdenabled.png");
		
		// Verifying Tile contains Online
		methods_Obj.titleContains("Online", true);
		
		// Enter UID and PWD
		loginpage.Loginpage_UserID.sendKeys(methods_Obj.sheet.getCell(0, 1).getContents());
		loginpage.LoginPage_PWD.sendKeys(methods_Obj.sheet.getCell(0, 2).getContents());
		
		// Verifying Sign available and Enabled
		methods_Obj.elementAvailable(loginpage.LoginPage_SignIN, true, "C:\\Users\\DELL\\Desktop\\FW10\\Test Results\\Kishore\\Purchases\\Purchases_LoginTest\\signinAvailable.png");
		methods_Obj.elementEnabled(loginpage.LoginPage_SignIN, true, "C:\\Users\\DELL\\Desktop\\FW10\\Test Results\\Kishore\\Purchases\\Purchases_LoginTest\\signinEnabled.png");
		
		// Click on Sigin
		loginpage.LoginPage_SignIN.click();
		
		// Apply WebDriverWait
		WebDriverWait ww=new WebDriverWait(methods_Obj.driver, 30);
		
		// Waiting until url contains DashBoard
		ww.until(ExpectedConditions.urlContains("DashBoard"));
		
		// Verify Number of links
		methods_Obj.elementsCount("a", 20);
		
		// Import Page Objects for purchase page
		PO_HomePage homepage=PageFactory.initElements(methods_Obj.driver, PO_HomePage.class);
		
		// Clickk on purchases link
		homepage.HomePage_PurchaseLink.click();
		
		// Close App
		methods_Obj.driver.close();		
	}
	//******************************************************************************
	
	

}

