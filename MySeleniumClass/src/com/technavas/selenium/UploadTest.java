package com.technavas.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
		ChromeDriver mydriver = new ChromeDriver();
			mydriver.get("http://demo.guru99.com/test/upload/");
			mydriver.manage().window().maximize();
			mydriver.findElement(By.name("uploadfile_0")).sendKeys("/Users/tarjindersingh/downloads/Eon Bill (1).docx");
			mydriver.findElement(By.id("terms")).click();
	}

}
