package com.technavas.selenium;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/tarjindersingh/Downloads/chromedriver");
		ChromeDriver mydriver = new ChromeDriver();
		mydriver.get("http://techedgeplus.com");
		mydriver.manage().window().maximize();
		
		FileInputStream fs = new FileInputStream("/Users/tarjindersingh/Downloads/Book1.xlsx");
		XSSFWorkbook xw = new XSSFWorkbook(fs);
		XSSFSheet xs = xw.getSheetAt(0);
		for(int row = 1; row <=xs.getLastRowNum();row++) {
		int col = 1;
		XSSFCell user,pass;
		user = xs.getRow(row).getCell(col);
		pass = xs.getRow(row).getCell(col+1);
		System.out.println(user.toString());
		System.out.println(pass.toString());
		
		mydriver.findElement(By.id("txtLoginid")).sendKeys(user.toString());
		mydriver.findElement(By.id("txtpassword")).sendKeys(pass.toString());
		mydriver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);
		mydriver.switchTo().alert().accept();
		
		
		mydriver.findElement(By.id("txtLoginid")).clear();
		mydriver.findElement(By.id("txtpassword")).clear();
			
	}
		//xw.close();
		mydriver.close();
	}
}
