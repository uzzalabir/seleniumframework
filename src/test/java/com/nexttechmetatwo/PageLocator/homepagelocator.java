package com.nexttechmetatwo.PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.base_parent;

public class homepagelocator extends base_parent {
	
	public homepagelocator() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="login2")
	public WebElement loginlink;
	
	@FindBy(xpath = "//a[text()='Nokia lumia 1520']")
	public WebElement nokiaphone;

	@FindBy(xpath ="//a[text()='Add to cart']")
	public WebElement addtocart;
	
	@FindBy(xpath ="//a[text()='Cart']")
	public WebElement cartlinkclick;


}
