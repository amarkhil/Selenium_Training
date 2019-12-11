package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTesting {
	

public WebDriver driver;
	 
	
	@Test(dataProvider ="testdata")
	
	public void login(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rafi\\Desktop\\group study\\code\\QA_Testers_Group_Study\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.gcrit.com/build3/admin/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("tdb1")).click();
		//Assert.assertEquals(driver.getCurrentUrl(), "http://www.gcrit.com/build3/admin/index.php");
		driver.close();
	}
	@DataProvider(name ="testdata")	
	public Object [][]readExcel()throws BiffException, IOException{
	
	 
			
		File xl = new File("C:/Users/rafi/Desktop/Book1.xls");
		System.out.println("excel located");
		
		Workbook work = Workbook.getWorkbook(xl);
		System.out.println("workbook open work");
		
		Sheet sheet = work.getSheet("Sheet1");
		
		int rows = sheet.getRows();
		int columns = sheet.getColumns();
		
		String inputdata [] [] = new String [rows][columns];
		for(int i = 0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				Cell cel = sheet.getCell(j, i);
					
				inputdata [i][j] = cel.getContents();
				System.out.println(inputdata[i][j]);
			
			
			}
			}
		return inputdata;
		}
		
		
		
	}



