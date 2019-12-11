package Amazon_class_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	WebDriver driver;
	
	@FindBy(id = "createAccountSubmit")
	WebElement creatAcc;
	
	
	public Signup(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void creatacc() {
		creatAcc.click();
	}
}
