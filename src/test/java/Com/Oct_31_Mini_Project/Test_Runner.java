package Com.Oct_31_Mini_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Runner extends Base_Class {
	
	public static WebDriver driver;
public static void main(String [] args) throws IOException {
	
	driver = getBrowser("chrome");
	getUrl("http://adactionhotelapp.com");
	maxi();
	
	WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
	sendkeys(user,"RoopaReddy");

	
	
	WebElement password = driver.findElement(By.xpath("//input[@id='passwd']"));
	sendkeys(password, "Music1710");
	
	WebElement login = driver.findElement(By.id("login"));
	click(login);
	
	WebElement location = driver.findElement(By.id("location"));
	select(location, "London");
	
	WebElement hotel = driver.findElement(By.id("hotels"));
	select(hotel, "Hotel Hervey");
	
	WebElement type = driver.findElement(By.id("room_Type"));
	selectByIndex(type, 2);
	
	WebElement room = driver.findElement(By.id("room_nos"));
	
	selectByIndex(room, 1);
	
	WebElement date = driver.findElement(By.id("datepick_out"));
	clear(date);
	sendkeys(date, "10/11/2021");
	
	WebElement child = driver.findElement(By.id("child_room"));
	selectByIndex(child, 2);
	
	WebElement submit = driver.findElement(By.id("Submit"));
	click(submit);
	WebElement radio = driver.findElement(By.id("radiobutton_0"));
	click(radio);
	WebElement cont = driver.findElement(By.id("continue"));	
	click(cont);
	WebElement first_n = driver.findElement(By.id("first_name"));
	sendkeys(first_n, "roopa");
	WebElement last_n = driver.findElement(By.id("last_name"));
    sendkeys(last_n, "reddy");
	WebElement addr = driver.findElement(By.id("address"));
	sendkeys(addr,"hosur,tamilandu");
	WebElement cont_num = driver.findElement(By.id("contact_number"));
    sendkeys(cont_num, "6364585698");
	WebElement cctype = driver.findElement(By.id("cc_type"));
	sendkeys(cctype,"Visa");
	WebElement mnth = driver.findElement(By.id("cc_exp_month"));
	sendkeys(mnth,"may");
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	sendkeys(year, "2022");
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	sendkeys(cvv, "789");
	WebElement book = driver.findElement(By.id("book_now"));
	click(book);
	WebElement it = driver.findElement(By.xpath("//a[@href='booledItinerary.php']"));
    click(it);
    takeScreenshot();
	WebElement logout = driver.findElement(By.xpath("//a[@herf=Logout.php']"));
	click(logout);
}}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	