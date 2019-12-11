package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignement {
	
	public WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement charger;
	
	@FindBy(xpath = "//*[@class=\"nav-input\"]")
	WebElement search;
	
	@FindBy(xpath = "(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")
	WebElement select;
	
	@FindBy(id = "add-to-cart-button")
	WebElement addcart;
	
	
	
	
	public Assignement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void charger() {
		charger.sendKeys("iphone charger");
	}
	public void search() {
		search.click();
	}
	public void select() {
		select.click();
	}
	public void addcart() {
		addcart.click();
	}
	
	

}
