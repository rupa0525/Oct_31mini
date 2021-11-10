package Com.Oct_31_Mini_Project;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Com.pom.Customer_Details;
import Com.pom.Login_Page;
import Com.pom.Select_Hotel;

public class Test_Runner1 extends Base_Class {
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static Login_Page lg = new Login_Page(driver);
	public static Hotel_Details hd = new Hotel_Details(driver);
	public static Customer_Details cd= new Customer_Details(driver);
	public static Select_Hotel sh=new Select_Hotel(driver);
	public static void main(String[] args) throws IOException {
	
		getUrl("http://adactinhotelapp.com/HotelAppBuild2/");
		max();
		sendkeys(lg.getUsername(), "RoopaReddy");
		sendkeys(lg.getPassword(), "789456123");
		click(lg.getLogin());
		dropDown("byvisibletext", hd.getLocation(), "Sydney");
		dropDown("byvisibletext", hd.getHotel(),"Hotel Sunshine");
		dropDown("byindex", hd.getRoom(), "2");
		dropDown("byindex", hd.getNo(), "1");
		clear(hd.getDate());
		sendkeys(hd.getDate(), "26/11/2021");
		dropDown("byindex", hd.getChild(), "2");
		click(hd.getSubmit());
	
		click(sh.getRadio());
		click(sh.getCon());
		sendkeys(cd.getFirstname(), "Roopa");
		sendkeys(cd.getLastname(), "Srinivasreddy");
		sendkeys(cd.getAddress(), "Bangalore");
		sendkeys(cd.getCc_num(), "1234567891234567");
		sendkeys(cd.getCc_type(), "VISA");
		sendkeys(cd.getExp_mnth(), "May");
		sendkeys(cd.getExp_year(), "2022");
		sendkeys(cd.getCvv(), "885");
		click(cd.getBook());
		click(cd.getIt());
		takeScreenshot();
		click(cd.getLogout());
	
	}
	private static void takeScreenshot() {
		// TODO Auto-generated method stub
		
	}
	private static void clear(WebElement date) {
		// TODO Auto-generated method stub
		
	}
	private static void sendkeys(WebElement username, String string) {
		// TODO Auto-generated method stub
		
	}
	public static void getUrl(String string) {
		// TODO Auto-generated method stub
		
	}
	private static void dropDown(String string, WebElement location, String string2) {
	}
}