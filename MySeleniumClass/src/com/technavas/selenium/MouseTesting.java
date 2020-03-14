package com.technavas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
		ChromeDriver mydriver = new ChromeDriver();
			mydriver.get("http://techcanvass.com");
			mydriver.manage().window().maximize();
			
			Actions action = new Actions(mydriver);
			Thread.sleep(3000);
			WebElement element = mydriver.findElement(By.linkText("Self-learning Courses"));
			Thread.sleep(3000);
			action.moveToElement(element).build().perform();

			Thread.sleep(2000);
			WebElement au = mydriver.findElement(By.linkText("Automation Testing"));
			action.moveToElement(au).build().perform();
			Thread.sleep(2000);
			
			WebElement seElement = mydriver.findElement(By.linkText("Selenium Self Learning"));
			seElement.click();
	}

}
