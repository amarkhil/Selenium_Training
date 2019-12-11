package Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice_Practise {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Exercises\\Drive\\chromedriver.exe");
		driver = new ChromeDriver();
	//	driver.get("https://hotmail.com");
	//	driver.navigate().to("https://www.facebook.com");
		
	//	driver.get("https://designmodo.com/examples-sliders-web-design/");
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
	/*
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String sessionId = driver.getWindowHandle();
		System.out.println(sessionId);
	
		Select day = new Select(driver.findElement(By.id("abc")));
		day.selectByVisibleText("17");
		
		driver.switchTo().frame(driver.findElement(By.id("abc")));
		driver.switchTo().frame(1);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys("abc");
		driver.switchTo().alert().accept();
		
		Actions hi = new Actions(driver);
		WebElement hello = driver.findElement(By.id("abc"));
		
		hi.moveToElement(hello).build().perform();
		*/
	/*
		Select hello = new Select(driver.findElement(By.id("month")));
		hello.selectByVisibleText("Mar");
		
		Select day =new Select(driver.findElement(By.id("day")));
		day.selectByValue("14");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1990");
		
		*/
		/*
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Create free account'])[1]")).click();
		
		driver.findElement(By.id("MemberName")).sendKeys("Ahmadrafiamarkhil");
		driver.findElement(By.id("iSignupAction")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("PasswordInput")).sendKeys("This12345");
		Thread.sleep(2000);
		driver.findElement(By.id("ShowHidePasswordCheckbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("iSignupAction")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("ahmad");
		driver.findElement(By.id("LastName")).sendKeys("ahmadi");
		driver.findElement(By.id("iSignupAction")).click();
		Thread.sleep(3000);
		Select city = new Select(driver.findElement(By.xpath("//*[@id=\"Country\"]")));
		city.selectByVisibleText("Afghanistan");
		
		Select month = new Select(driver.findElement(By.id("BirthMonth")));
		month.selectByIndex(1);
		
		Select day = new Select(driver.findElement(By.id("BirthDay")));
		day.selectByValue("25");
		
		Select year = new Select(driver.findElement(By.id("BirthYear")));
		year.selectByVisibleText("2000");
		
		*/
	/*
		Actions Shift = new Actions(driver);
		//WebElement hi = driver.findElement(By.id("u_0_2"));
		//Shift.keyDown(Keys.SHIFT).click(hi).build().perform();
		Thread.sleep(3000);
		*/
		
	/*	Actions key = new Actions(driver);
		WebElement y = driver.findElement(By.xpath("(//*[text()='Create free account'])[1]"));
		key.keyDown(Keys.CONTROL).click(y).build().perform();
		
		*/
		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.id("google_esf")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"btn btn-danger\"]")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
