package Facebook.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homef {
	public WebDriver driver;
	
	@FindBy(id = "email")
	WebElement enteremail;
	@FindBy(id = "pass")
	WebElement enterpass;
	@FindBy(id = "u_0_2")
	WebElement clicklogin;

	public Homef(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void inputemail(String email) {
		enteremail.sendKeys(email);
	}
	public void inputpass(String pass) {
		enterpass.sendKeys(pass);
	}
	public void clicklogin() {
		clicklogin.click();
	}

	

}
