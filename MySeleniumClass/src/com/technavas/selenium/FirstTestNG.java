package com.technavas.selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstTestNG {
  //@Test(priority = 2)
	@Test(dependsOnMethods = {"mysecondTestCase"})
  public void myfirstTestCase() {
	  System.out.println("FirstTestCase");
  }
  @Test(priority = 2)
  public void mysecondTestCase() {
	  System.out.println("SecondTestCase");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

}
