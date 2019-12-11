package group_study;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotHandle {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		//  driver.manage().window().maximize();
		  driver.navigate().to("https://www.facebook.com");
		  takeScreenshot("Facebook_LoginPage");
		
		  
		  

	}

	  public static void takeScreenshot(String fileName) throws IOException {
		  //1.take Screenshot and store it as a file formate:
		  
		File file =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2.now
		FileUtils.copyFile(file, new File("C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\src\\group_study\\"+fileName+".jpg"));
		
		
		  
		  
	  }
}