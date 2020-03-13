package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PO_HomePage {
	
	public @FindBy(xpath="//*[@id='menubarlogos']/li[1]/a/span") WebElement HomePage_DashBoardLink;
	public @FindBy(xpath="//*[@id='menubarlogos']/li[2]/a/span") WebElement HomePage_PurchaseLink;
	

}
