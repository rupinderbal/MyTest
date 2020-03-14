package com.technavas.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SecondTestNG {
ChromeDriver mydriver;
  @Test
  public void myThirdClass1() {
	  System.out.println("My Third Class");
  }
  @Test
  public void myFourthClass() throws InterruptedException {
	  System.out.println("My Fourth Class");

		mydriver.switchTo().frame("a077aa5e");
		//mydriver.switchTo().frame(0);
		
		Thread.sleep(2000);
		mydriver.findElement(By.xpath("html/body/a/img")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
		mydriver = new ChromeDriver();
		mydriver.get("http://demo.guru99.com/test/guru99home/");
		mydriver.manage().window().maximize();
  }

  @AfterTest
  
  public void afterTest() {
	  mydriver.quit();
  }

}
