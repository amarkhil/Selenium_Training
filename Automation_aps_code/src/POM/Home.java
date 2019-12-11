package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//@findBy help us to locate an element and store it to a variable.


	

public class Home {

	public WebDriver driver;
	
	@FindBy(id="email")
	WebElement emailfield;
	
	@FindBy(id="pass")
	WebElement passwd;
	
	@FindBy(xpath="//*[@value='Log In']")
	WebElement loginbutton;
	
	@FindBy(linkText="Forgot account?")
	WebElement forgotlink;
	
	
	
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public void enteremail(String email) {
		emailfield.sendKeys(email);
	}
	public void enterpasswd(String pass) {
		passwd.sendKeys(pass);
	}
	public void clicklonginbutton() {
		loginbutton.click();
	}
	public void clickgorgotlink() {
		forgotlink.click();
	}
}
