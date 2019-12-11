package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin {
	public WebDriver driver;

	@FindBy(linkText="create an account")
	WebElement creataccount;
	
	public signin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void creataccount() {
		creataccount.click();
	}
}
