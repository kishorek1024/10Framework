package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_LoginPage {
	
	// Page Name  : Login Page
	// App Name   : Automobiles
	// Project Name : Revlon
	// Author       : Kishore Kumar
	// Date Created : 02262010
	// Reviewed By  : Sudha
	//******************************************************************
	
	public @FindBy(xpath="//input[@id='ContentPlaceHolder1_txtUserId']") WebElement Loginpage_UserID;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_txtPassword']") WebElement LoginPage_PWD;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_btnLogin']") WebElement LoginPage_SignIN;

}
