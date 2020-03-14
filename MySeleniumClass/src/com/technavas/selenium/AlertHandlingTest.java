package com.technavas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
		ChromeDriver mydriver = new ChromeDriver();
			mydriver.get("http://techedgeplus.com");
			mydriver.manage().window().maximize();
			
			mydriver.findElement(By.id("txtLoginid")).sendKeys("test1");
			mydriver.findElement(By.id("txtpassword")).sendKeys("test1");
		
			mydriver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
			mydriver.switchTo().alert().accept();
			
			Thread.sleep(2000);
			mydriver.findElement(By.id("txtLoginid")).clear();
			mydriver.findElement(By.id("txtpassword")).clear();
			//mydriver.close();
	}

}
