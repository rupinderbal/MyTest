package com.techcanvass.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.techcanvass.pages.FormfillingPage;

public class FormFillingTest {
WebDriver mydriver;

  @Test
  public void fillform() {
	  
	  //FormfillingPage fPage = new FormfillingPage();
	  FormfillingPage fPage = PageFactory.initElements(mydriver, FormfillingPage.class);
	  fPage.setName("Rupinder");
	  fPage.setMsg("Hello");
	  fPage.setemail("rupinder.bal5@yahoo.com");	
	  fPage.click();
	  
	  /*fPage.setName(mydriver, "Rupinder");
	  fPage.setMsg(mydriver, "Hello");
	  fPage.setEmail(mydriver, "rupinder.bal5@yahoo.com");	
	  fPage.clickSubmit(mydriver);*/
	  
	  
	  //Assert.assertEquals(mydriver.getTitle(),"TitlePage");
			//mydriver.findElement(By.className("validate[required]")).sendKeys("Rupinder");
			//mydriver.findElement(By.id("txtEmail")).sendKeys("rupinder.bal5@yahoo.com");
			//mydriver.findElement(By.name("txtMessage")).sendKeys("Enquiry for Selenium");
			//mydriver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
			

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
	  mydriver = new ChromeDriver();
			mydriver.get("https://techcanvass.com");
			mydriver.manage().window().maximize();
			mydriver.navigate().to("https://techcanvass.com/Contact-Techcanvass.aspx");
		
  }

  @AfterTest
  public void afterTest() {
	  mydriver.close();
  }

}
