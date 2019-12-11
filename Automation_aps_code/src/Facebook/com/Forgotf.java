package Facebook.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotf {
	static WebDriver driver;
	
	@FindBy(linkText ="Forgot account?")
	WebElement Forgot;
	
	public Forgotf(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void forgot() {
		Forgot.click();
	}
}
