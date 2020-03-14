package com.technavas.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class ThirdClassNG {
	ChromeDriver mydriver;
  @Test
  public void f() throws InterruptedException {
	 
			
			
			Actions action = new Actions(mydriver);
			Thread.sleep(3000);
			WebElement element = mydriver.findElement(By.linkText("Self-learning Courses"));
			Thread.sleep(3000);
			action.moveToElement(element).build().perform();

			Thread.sleep(2000);
			WebElement au = mydriver.findElement(By.linkText("Automation Testing"));
			action.moveToElement(au).build().perform();
			Thread.sleep(2000);
			
			WebElement seElement = mydriver.findElement(By.linkText("Selenium Self Learning zzzz"));
			seElement.click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
		 mydriver = new ChromeDriver();
			mydriver.get("http://techcanvass.com");
			mydriver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  mydriver.close();
  }

}
