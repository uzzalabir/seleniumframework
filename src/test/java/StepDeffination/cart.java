package StepDeffination;

import com.nexttechmetatwo.PageAction.cartpageaction;
import com.nexttechmetatwo.PageAction.homepageaction;
import com.nexttechmetatwo.PageAction.loginpageaction;

import Utility.base_parent;
import Utility.utility;
import cucumber.api.java.en.Then;

public class cart extends base_parent{
	
	homepageaction Homepageaction=new homepageaction();
	
	cartpageaction Cartpageaction=new cartpageaction();
	
	@Then("^click Nokia Lumia$")
	public void click_Nokia_Lumia() throws Throwable {
		
		Homepageaction.clickNokiaLumia();
	    
	}

	@Then("^click add to cart$")
	public void click_add_to_cart() throws Throwable {
		Homepageaction.clickaddtocart();
	    	}
	
	@Then("^click cart link$")
	public void click_cart_link() throws Throwable {
		
		Homepageaction.clickcartlink();
	    
	}


	@Then("^Verify item added in cart$")
	public void verify_item_added_in_cart() throws Throwable {
		
		Cartpageaction.Verifyitemaddedincart();
		utility.takeMyScreenshot(driver, "Cart Page");
	    
	}



}
