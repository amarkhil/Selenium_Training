package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	
	public WebDriver driver;
	
	@FindBy(id="firstname")
	WebElement Firstnameop;
	@FindBy(id="lastname")
	WebElement lastname;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="PASSWORD")
	WebElement psswd;
	@FindBy(id="ppaFormSbtBtn")
	WebElement signup;
	
	
	public Signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void Firstnameoption(String name) {
		Firstnameop.sendKeys(name);
	}
	public void lastname(String ls) {
		lastname.sendKeys(ls);
	}
	public void email(String ids) {
		email.sendKeys(ids);
	}
	public void psswd(String psw) {
		psswd.sendKeys(psw);
	}
	public void signupbutton() {
		signup.click();
	}

}
