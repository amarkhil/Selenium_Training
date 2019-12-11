package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Asign1 {
	public WebDriver driver;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement dinningTable;
	
	@FindBy(xpath = "//*[@class=\"nav-input\"]")
	WebElement search;
	
	@FindBy(xpath = "(//*[@class=\"a-size-base-plus a-color-base a-text-normal\"])[1]")
	WebElement choose;
	
	@FindBy(id = "add-to-cart-button")
	WebElement addca;
	
	
	
	public Asign1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void dinningTable() {
		dinningTable.click();
	}
	public void search() {
		search.click();
	}
	public void choose() {
		choose.click();
	}
	public void addca() {
		addca.click();
	}

}
