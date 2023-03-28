package com.nexttechmetatwo.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.base_parent;

public class cartpagelocator extends base_parent {
	
	public cartpagelocator() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//td[text()='Nokia lumia 1520']")
	public WebElement verifycart;
	

}
