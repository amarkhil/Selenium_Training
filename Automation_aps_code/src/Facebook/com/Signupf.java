package Facebook.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Signupf {
	static WebDriver driver;
	
	

	
	
	@FindBy(id = "u_0_f")
	WebElement entername;
	@FindBy(id = "u_0_h")
	WebElement enterlname;
	@FindBy(id = "u_0_k")
	WebElement enteremail;
	@FindBy(id = "u_0_r")
	WebElement enterpass;
	@FindBy(id = "u_0_n")
	WebElement enter2email;
	
	
	public Signupf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void entername(String name) {
		entername.sendKeys(name);
	}
	public void enterlname(String lname) {
		enterlname.sendKeys(lname);
	}
	public void enteremail(String email) {
		enteremail.sendKeys(email);
	}
	public void enterpass(String pass) {
		enterpass.sendKeys(pass);
		
	}
	public void enter2email(String emai) {
		enter2email.sendKeys(emai);
	}
}
	
	
	
	

