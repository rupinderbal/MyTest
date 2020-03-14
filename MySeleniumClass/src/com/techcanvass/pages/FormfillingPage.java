package com.techcanvass.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormfillingPage {
	
	//By nameParam = By.className("validate[required]");
	//By emailParam = By.id("txtEmail");
	//By msgParam = By.name("txtMessage");
	//By clickParam = By.xpath("//*[@id=\"btnSubmit\"]");
	
	@FindBy(className = "validate[required]")
	WebElement nameParam;
	
	@FindBy(id = "txtEmail")
	WebElement emailParam;
	
	@FindBy(name = "txtMessage")
	WebElement msgParam;
	
	@FindBy(xpath = "//*[@id=\"btnSubmit\"]")
	WebElement clickParam;
	
	public void setName(String name) {
		nameParam.sendKeys(name);
	}
	public void setemail(String Email) {
		emailParam.sendKeys(Email);
	}
	public void setMsg(String msg) {
		msgParam.sendKeys(msg);
	}
	public void click() {
		clickParam.click();
	}
	
	
	/*public void setName(WebDriver mydriver,String name) {
		mydriver.findElement(nameParam).sendKeys("Rupinder");
	}
	public void setEmail(WebDriver mydriver,String Email) {
		mydriver.findElement(emailParam).sendKeys("rupinder.bal5@yahoo.com");
	}
	public void setMsg(WebDriver mydriver,String Msg) {
		mydriver.findElement(msgParam).sendKeys("Enquiry for Selenium");
	}
	public void clickSubmit(WebDriver mydriver) {
		mydriver.findElement(clickParam).click();
	}*/
	

}
