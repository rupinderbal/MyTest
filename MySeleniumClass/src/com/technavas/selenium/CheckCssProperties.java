package com.technavas.selenium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckCssProperties {

	public static void main(String[] args) {
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
			String color = mydriver.findElement(By.className("validate[required]")).getCssValue("color");
			String fontsize = mydriver.findElement(By.className("validate[required]")).getCssValue("font-size");
			//mydriver.findElement(By.id("txtEmail")).sendKeys("rupinder.bal5@yahoo.com");
			System.out.println(color);
			System.out.println(fontsize);
			Assert.assertEquals(fontsize, "15px");
			//assert.assertEquals(fontsize, "15px");

	}

}
