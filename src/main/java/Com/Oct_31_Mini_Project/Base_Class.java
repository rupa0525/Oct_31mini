
package Com.Oct_31_Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {

	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"driver\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			
		
		}
		
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"driver\\chromedriver.exe");
			
			driver = new FirefoxDriver();
			
			
			
		}
		return driver;
		}
	
	public static void getUrl(String url) {
		
	driver.get(url);
	}
	public static void max() {
		
		driver.manage().window().maximize();
	}
	public static void click(WebElement element) {
		element.click();
		
		public static void sendkeys(WebElement element,String input) {
			element.sendKeys(input);
			
			
			public static void select(WebElement Sel, String selectdroption) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
