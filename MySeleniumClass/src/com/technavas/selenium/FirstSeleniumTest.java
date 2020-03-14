package com.technavas.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*import org.openqa.selenium.safari.SafariDriver;*/
import org.openqa.selenium.support.ui.Select;



public class FirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
	ChromeDriver mydriver = new ChromeDriver();
		/*WebDriver mydriver = new SafariDriver();*/
		mydriver.get("https://techcanvass.com");
		mydriver.manage().window().maximize();
	//mydriver.close();
		mydriver.navigate().to("https://techcanvass.com/Contact-Techcanvass.aspx");
		//mydriver.navigate().back();
		//mydriver.navigate().forward();
		//mydriver.quit();
		//mydriver.findElement(By.name("txtName")).sendKeys("Rupinder");
		mydriver.findElement(By.className("validate[required]")).sendKeys("Rupinder");
		mydriver.findElement(By.id("txtEmail")).sendKeys("rupinder.bal5@yahoo.com");
	 Select myselect =new Select(mydriver.findElement(By.xpath("//*[@id=\"ddlSubject\"]")));
		
		
		//Thread.sleep(3000);
		myselect.selectByValue("Course Enquiry");
        //myselect.selectByVisibleText("Feedback");
		//myselect.selectByIndex(3);
	Select mycontact = new Select(mydriver.findElement(By.id("CountryCode")));
	mycontact.selectByIndex(1);
		
		//mydriver.findElement(By.name("Form1")).sendKeys("0123456789");
		mydriver.findElement(By.name("txtMessage")).sendKeys("Enquiry for Selenium");
		
		
		//Thread.sleep(2000);
				
		mydriver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
		mydriver.findElement(By.linkText("Buy Online")).click();
		//System.out.println("Hello");
		mydriver.close();
		
		/*WebDriver mydriver = new ChromeDriver();
		mydriver.get("https://www.google.com");*/

	}

}
