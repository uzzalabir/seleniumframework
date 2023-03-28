package StepDeffination;

import com.nexttechmetatwo.PageAction.accountpageaction;
import com.nexttechmetatwo.PageAction.homepageaction;
import com.nexttechmetatwo.PageAction.loginpageaction;

import Utility.base_parent;
import Utility.utility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class login extends base_parent {
	
	homepageaction Homepageaction=new homepageaction();
	loginpageaction Loginpageaction=new loginpageaction();
	accountpageaction Accountpageaction=new accountpageaction();
	
	@Given("^MetaLaunchURL \"([^\"]*)\"$")
	public void metalaunchurl(String URL) throws Throwable {
		
	metalaunchURL(URL);
	    
	}
	
	@Then("^Click login link$")
	public void click_login_link() throws Throwable {
		
		Homepageaction.Clickloginlink();
	    
	}

	@Then("^Enter Username and Enter Password and Click login button$")
	public void enter_Username_and_Enter_Password_and_Click_login_button() throws Throwable {
		
		Loginpageaction.metalogincard(metaproperty.getProperty("username1"),metaproperty.getProperty("password1"));
	    
	}

	@Then("^Verify user can login with valid card$")
	public void verify_user_can_login_with_valid_card() throws Throwable {
		
		Accountpageaction.Verifyusercanloginwithvalidcard();
		
		utility.takeMyScreenshot(driver,"Profile page");
	     
	}


}
