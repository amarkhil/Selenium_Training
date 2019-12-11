package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asign2 {

	public WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement ball;
	
	@FindBy(xpath = "//*[@class=\"nav-input\"]")
	WebElement search;
	
	@FindBy(xpath = "(//*[@class=\"a-size-base-plus a-color-base a-text-normal\"])[1]")
	WebElement elect;
	
	@FindBy(id="add-to-cart-button")
	WebElement addc;
	
	
	public Asign2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void ball() {
		ball.sendKeys("ball");
	}
	public void search() {
		search.click();
	}
	public void elect() {
		elect.click();
	}
	public void addc() {
		addc.click();
	}
	
	
	
	
	
	
	
	
}
