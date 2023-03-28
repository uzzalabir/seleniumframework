package com.nexttechmetatwo.PageAction;

import com.nexttechmetatwo.PageLocator.homepagelocator;

import Utility.base_parent;

public class homepageaction extends base_parent {
	
	homepagelocator Homepagelocator=new homepagelocator();
	
	
	public void Clickloginlink() throws Exception {
		
		Homepagelocator.loginlink.click();
		
		Thread.sleep(7000);
		
	}
	
	public void clickNokiaLumia() {
		
		Homepagelocator.nokiaphone.click();
		
	}
	
	public void clickaddtocart() throws Exception {
		
		Homepagelocator.addtocart.click();
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
	}
	
	public void clickcartlink() {
		
		Homepagelocator.cartlinkclick.click();
		
	}

}
