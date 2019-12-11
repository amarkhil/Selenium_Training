package GroupStuday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class MortgageC {
	static int i;
	static String Homevalue, DownPay, IntRate, LoanTerm, PropTax, PMI, HomeIns, MnthHOA;
	


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rafi\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.mortgagecalculator.org");//		
		
		
		for (i = 1; i <=5; i++) {
			
			
			if (i==1) {
			Homevalue = "520000";
			DownPay = "170000";
			IntRate = "4.50";
			LoanTerm = "30";
			PropTax = "7000";
			PMI = "1.0";
			HomeIns = "600";
			MnthHOA = "104";

		} else if (i==2) {
			
			Homevalue = "620000";
			DownPay = "270000";
			IntRate = "4.75";
			LoanTerm = "35";
			PropTax = "10000";
			PMI = "2.0";
			HomeIns = "800";
			MnthHOA = "120";	
		
		}else if (i==3) {
			Homevalue = "650000";
			DownPay = "290000";
			IntRate = "4.50";
			LoanTerm = "30";
			PropTax = "15000";
			PMI = "3.0";
			HomeIns = "8000";
			MnthHOA = "150";	
		}else if (i==4) {
			Homevalue = "550000";
			DownPay = "120000";
			IntRate = "4.75";
			LoanTerm = "30";
			PropTax = "1500";
			PMI = "3.0";
			HomeIns = "10000";
			MnthHOA = "250";	
		} else if (i==5) {
			
			Homevalue = "540000";
			DownPay = "90000";
			IntRate = "5";
			LoanTerm = "30";
			PropTax = "70000";
			PMI = "2.0";
			HomeIns = "1100";
			MnthHOA = "145";	
		
		}


		
		
		
		
		
//		1.	Create a Test Script that iterates at least 4 times with the help of for loop 
		
//
//		2.Follow below steps for the assignment.
//		a.	 go to https://www.mortgagecalculator.org/ , and create an automation script that will iterate atleast 4 times with different sets of data. 

		
		
		//b.	All data must be stored in variables. 
	//	driver.findElement(By.xpath("(//*[@class=\"highcharts-point\"])[125]")).click();
		
		//		c. 	You must use implicit and explicit wait wherever needed.
//		d.	Get Current window ID, and url for the mortgage calculator homepage and print it on console.
		String windows = driver.getWindowHandle();
		System.out.println(windows);
		
		
//		e. 	Check if you are on "Mortagecalculator page", if yes, then print the boolean value (true or false).
		
		
	
//		f.	Capture the "Morgage calculator" title and save it to a string variable  and print it on console.
		
//		g.	enter the Home Value
		driver.findElement(By.id("homeval")).sendKeys("500000");
		
//		h.	Enter down payments
		driver.findElement(By.id("downpayment")).sendKeys("10000");
//		i.	enter interest rate
		
		driver.findElement(By.id("intrstsrate")).sendKeys("4");
//		j.	enter loan term
		
		driver.findElement(By.id("loanterm")).sendKeys("15");
//		k.	select start month
		
		Select month = new Select(driver.findElement(By.xpath("//*[@name=\"param[start_month]\"]")));
		month.selectByVisibleText("Jan");
		
//		l.	enter start year
		driver.findElement(By.id("start_year")).sendKeys("2018");
		
//		m.	enter property tax
		driver.findElement(By.id("pptytax")).sendKeys("5000");
		
//		n.  enter pmi
		driver.findElement(By.id("pmi")).sendKeys("1");
		;
//		o.	enter home ins
		driver.findElement(By.id("hoi")).sendKeys("1100");
		
//		p.	enter monthly HOA
		driver.findElement(By.id("hoa")).sendKeys("400");
		Thread.sleep(3000);
//		q.	select loan type
		Select loan = new Select(driver.findElement(By.name("param[milserve]")));
		loan.selectByVisibleText("FHA");
		Thread.sleep(3000);
//		r.	click on Cmpare Loan Types
		driver.findElement(By.xpath("(//*[@type=\"button\"])[3]")).click();
//		s.	get the window id for the page.
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		Thread.sleep(3000);
		String nwindow = driver.getWindowHandle();
		System.out.println(nwindow);
		Thread.sleep(3000);
		
//		t.  Capture FHA Loan and print it on console.
		
		String capturfhaloan = driver.findElement(By.xpath("//html//body//div//h1[contains(text(),'FHA Loan')]")).getText();
		System.out.println(capturfhaloan);
		
		
		
		
//		u.	verify and compare the Minimum Down Payment:3.5%
		Thread.sleep(3000);
		String capturedownpayment = driver.findElement(By.xpath("//li[contains(text(),'Minimum Down Payment: 3.5%')]")).getText();
		System.out.println(capturedownpayment);
		
//		v.	The expected value  is : "Minimum Down Payment: 3.5%"
//				hint: capture the actual value "Minimum Down Payment: 3.5%",and save it in a string varialbe then compare it with the expected value "Minimum Down Payment: 3.5%", use Assertions and if statements. Make sure to print on console.
		
		
		String expectedvalue = "Minimum Down Payment: 3.5%";
		
		String actualvalue = driver.findElement(By.xpath("//li[contains(text(),'Minimum Down Payment: 3.5%')]")).getText();
		System.out.println(actualvalue);
		try {
		Assert.assertEquals(actualvalue,expectedvalue );
		}catch(AssertionError error) {
		System.out.println("comparison with assertion"+"they are not same");
		throw error;
		}
		System.out.println("comparison with assertion"+"They are the same");
		
		
			
		
//		w.	Close the FHA Loan Page
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("cboxClose")).click();
//		x.	Select Buy or Refi.
		
		
		Select buyorrefi = new Select(driver.findElement(By.xpath("//*[@name=\"param[refiorbuy]\"]")));
		buyorrefi.selectByVisibleText("Buy");
//		y.	Select Credit Rating
		Thread.sleep(2000);
		Select credit = new Select(driver.findElement(By.id("credit_rating")));
		credit.selectByValue("1");
//		z.	Click on show Amortization Tables
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Show Amortization Tables')]")).click();
//		aa.	create a script that will toggle or select  "Draw Charts", "Show annual amortization table", and "Show monthly amortization table"
//				--->if its toggled already then don't click on it, if not
//			then click on it and mark it.--> use conditional statements if needed.
		
		WebElement option = driver.findElement(By.id("draw_charts_i"));
		
		if(!option.isSelected()) 
			option.click();
			System.out.println("the draw chart is not selected");
		
		
		driver.findElement(By.id("show_annual_i")).click();
		driver.findElement(By.id("show_monthly_i")).click();
		
		
		//option.click();
//		if(option.isSelected()) {
//				System.out.println("the draw chart is selected");
//		}else{
//			System.out.println("the draw chart is not selected");
//		}
//		option.click();
		
//		ab.	Click on Calculate button
		driver.findElement(By.xpath("//*[@value=\"Calculate\"]")).click();
		
//		ac.	Capture Total Monthly Payment from the "Mortgage Repayment Summary"
		String monthlypayment = driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/form[1]/section[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/h3[1]")).getText();
	System.out.println(monthlypayment);
//		ad. From Yearly Amortization Schedule capture the interest for any year based on your loan term(2019 to 2050)
	Thread.sleep(3000);
	String interest = driver.findElement(By.xpath("//*[@id=\"schedule\"]/div[10]/div[2]")).getText();
			System.out.println(interest);
//		ae.	From Monthly Amortization Schedule capture the Principle for the month of Oct, 2020.
			
		String monthprinciple =	driver.findElement(By.xpath("//*[@id=\"monthlyschedule\"]/div[13]/div[3]")).getText();
		System.out.println(monthlypayment);
//		ad. Print a meaningful text for each iteration.
		
		}
	}
}


