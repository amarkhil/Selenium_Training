package Amazon_class_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeA {
	WebDriver driver;
	
	@FindBy(xpath = "(//*[@class='nav-line-2 '])[2]")
	WebElement Prime;
	
	
	public HomeA(WebDriver driver) {	//constructor of class
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public void prime() {
		Prime.click();
	}
}
