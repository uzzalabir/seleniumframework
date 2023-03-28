package com.nexttechmetatwo.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.base_parent;

public class accountpagelocator extends base_parent {
	
	
	public accountpagelocator() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="nameofuser")
	public WebElement accountprofile;
	

}
