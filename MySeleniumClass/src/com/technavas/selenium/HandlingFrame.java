package com.technavas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
		ChromeDriver mydriver = new ChromeDriver();
		mydriver.get("http://demo.guru99.com/test/guru99home/");
		mydriver.manage().window().maximize();
		mydriver.switchTo().frame("a077aa5e");
		//mydriver.switchTo().frame(0);
		
		Thread.sleep(2000);
		mydriver.findElement(By.xpath("html/body/a/img")).click();
		//mydriver.close();
	}

}
