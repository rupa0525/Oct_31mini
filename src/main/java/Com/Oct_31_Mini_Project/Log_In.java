package Com.Oct_31_Mini_Project;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class Log_In {
		public WebDriver driver;
		@FindBy(xpath="//input[@name='username']")
		private WebElement username;
		
		@FindBy(xpath="//input[@name='password']") private WebElement password;
		
		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}

		@FindBy(id="login") private WebElement login;
		
		public Log_In(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		

	}


		



