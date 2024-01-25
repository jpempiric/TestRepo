package GitPackage;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
public class GitClass {


		public static void main(String[] args) throws Exception {
			
			//Setting the Property of ChromeBrowser and Passing ChromeDriver Path 
			// Setting the Property of Chrome Browser and Passing ChromeDriver Path
					System.setProperty("webdriver.chrome.driver", "C://Users//Empiric-52//eclipse-workspace//chromedriver.exe");
					WebDriver driver = new ChromeDriver();	
					driver.manage().window().maximize();
					driver.get("https://www.facebook.com/");
					driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();     //click on "Create New Account" Tab from Facebook Login Webpage
					Thread.sleep(2000);
	}

}
