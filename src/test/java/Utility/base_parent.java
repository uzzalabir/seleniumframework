package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_parent {
	
	public static Properties metaproperty;
	public static WebDriver driver;
	
	public base_parent() {
		
		try {
			FileInputStream files = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\nexttechmetatwo\\config\\MetaConfigTwo.Properties"); 
			
			metaproperty=new Properties();
			metaproperty.load(files);
		} catch (FileNotFoundException e) {
			System.out.println(" Please check your Constructor"); 
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void browserinit() {
		
	String metabrowser=	metaproperty.getProperty("Browser1");
	
	if (metabrowser.equalsIgnoreCase("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDriver\\chromedriver.exe");
		
	     driver= new ChromeDriver();
	     
	      
	     driver.manage().window().maximize(); // maximizing the application window
	     driver.manage().deleteAllCookies();// delete all history 
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(testdata.implicitywait)); // wait time before start anything
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(testdata.pageloadwait)); // wait time for page load
		
	}
	
	else if (metabrowser.equalsIgnoreCase("FireFox")) {
		
	}
	
		
	}

public static void metalaunchURL(String URL) {
	
	driver.get(metaproperty.getProperty("URL1"));
		
	}


}
